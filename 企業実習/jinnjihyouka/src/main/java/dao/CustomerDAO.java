package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class CustomerDAO {
    private final String URL = "jdbc:h2:~/desktop/DB/jinji"; // H2用：ローカルに test.mv.db を作成
    private final String USER = "sa";
    private final String PASSWORD = "";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // 全件取得
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        String sql = "SELECT * FROM Customer";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
            	customerList.add(mapResultSetToCustomer(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerList;
    }

    // ID検索
    public Customer findById(String customerId) {
        String sql = "SELECT * FROM customer WHERE staff_id = ?";
        Customer customer = null;

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, customerId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                	customer = mapResultSetToCustomer(rs);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customer;
    }

    // 追加
    public boolean insert(Customer customer) {
        String sql = "INSERT INTO staff (customer_id, name, age, gender, date_of_hire, employment_period, license, certification, remarks,"
        		+ " last_evaluation_date_and_time,evaluation_user_id) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            setPreparedStatementValues(pstmt, customer);
            return pstmt.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // 更新
    public boolean update(Customer customer) {
        String sql = "UPDATE staff SET name=?, department=?, position=?, age=?, gender=?, date_of_hire=?, employment_period=?, license=?, certification=?, remarks=?,"
        		+ " last_evaluation_date_and_time=?, evaluation_user_id=? " +
                     "WHERE staff_id=?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            setPreparedStatementValues(pstmt, customer);
            pstmt.setString(11, customer.getCustomerId());
            return pstmt.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // 削除
    public boolean delete(String customerId) {
        String sql = "DELETE FROM customer WHERE customer_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, customerId);
            return pstmt.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // 共通：ResultSet から Staff 生成
    private Customer mapResultSetToCustomer(ResultSet rs) throws SQLException {
        return new Customer(
            rs.getString("customer_id"),
            rs.getString("name"),
            rs.getInt("age"),
            rs.getString("gender"),
            rs.getDate("date_of_hire").toLocalDate(),
            rs.getInt("employment_period"),
            rs.getString("license"),
            rs.getString("certification"),
            rs.getString("remarks"),
            rs.getTimestamp("last_evaluation_date_and_time"),
            rs.getString("evaluation_user_id")
        );
    }

    // 共通：PreparedStatement に値をセット
    private void setPreparedStatementValues(PreparedStatement pstmt, Customer customer) throws SQLException {
        pstmt.setString(1, customer.getCustomerId());
        pstmt.setString(2, customer.getName());
        pstmt.setInt(3, customer.getAge());
        pstmt.setString(4, customer.getGender());
        pstmt.setDate(5, Date.valueOf(customer.getDateOfHire()));
        pstmt.setInt(6, customer.getEmploymentPeriod());
        pstmt.setString(7, customer.getLicense());
        pstmt.setString(8, customer.getCertification());
        pstmt.setString(9, customer.getRemarks());
        pstmt.setTimestamp(10, customer.getLastEvaluationDateAndTime());
        pstmt.setString(11, customer.getEvaluationUserId());
    }
}
