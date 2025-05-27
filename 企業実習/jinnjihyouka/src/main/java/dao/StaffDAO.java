package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Staff;

public class StaffDAO {
    private final String URL = "jdbc:h2:~/test"; // H2用：ローカルに test.mv.db を作成
    private final String USER = "sa";
    private final String PASSWORD = "";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // 全件取得
    public List<Staff> findAll() {
        List<Staff> staffList = new ArrayList<>();
        String sql = "SELECT * FROM staff";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                staffList.add(mapResultSetToStaff(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return staffList;
    }

    // ID検索
    public Staff findById(String staffId) {
        String sql = "SELECT * FROM staff WHERE staff_id = ?";
        Staff staff = null;

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, staffId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    staff = mapResultSetToStaff(rs);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return staff;
    }

    // 追加
    public boolean insert(Staff staff) {
        String sql = "INSERT INTO staff (staff_id, name, department, position, age, gender, date_of_hire, employment_period, license, certification, remarks,"
        		+ " last_evaluation_date_and_time,evaluation_user_id) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            setPreparedStatementValues(pstmt, staff);
            return pstmt.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // 更新
    public boolean update(Staff staff) {
        String sql = "UPDATE staff SET name=?, department=?, position=?, age=?, gender=?, date_of_hire=?, employment_period=?, license=?, certification=?, remarks=?,"
        		+ " last_evaluation_date_and_time=?, evaluation_user_id=? " +
                     "WHERE staff_id=?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            setPreparedStatementValues(pstmt, staff);
            pstmt.setString(13, staff.getStaffId());
            return pstmt.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // 削除
    public boolean delete(String staffId) {
        String sql = "DELETE FROM staff WHERE staff_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, staffId);
            return pstmt.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // 共通：ResultSet から Staff 生成
    private Staff mapResultSetToStaff(ResultSet rs) throws SQLException {
        return new Staff(
            rs.getString("staff_id"),
            rs.getString("name"),
            rs.getString("department"),
            rs.getString("position"),
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
    private void setPreparedStatementValues(PreparedStatement pstmt, Staff staff) throws SQLException {
        pstmt.setString(1, staff.getStaffId());
        pstmt.setString(2, staff.getName());
        pstmt.setString(3, staff.getDepartment());
        pstmt.setString(4, staff.getPosition());
        pstmt.setInt(5, staff.getAge());
        pstmt.setString(6, staff.getGender());
        pstmt.setDate(7, Date.valueOf(staff.getDateOfHire()));
        pstmt.setInt(8, staff.getEmploymentPeriod());
        pstmt.setString(9, staff.getLicense());
        pstmt.setString(10, staff.getCertification());
        pstmt.setString(11, staff.getRemarks());
        pstmt.setTimestamp(12, staff.getLastEvaluationDateAndTime());
        pstmt.setString(13, staff.getEvaluationUserId());
    }
}
