package model;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Staff {
    private String staffId;
    private String name;
    private String department;
    private String position;
    private int age;
    private String gender;
    private LocalDate dateOfHire;
    private int employmentPeriod;
    private String license;
    private String certification;
    private String remarks;
    private Timestamp lastEvaluationDateAndTime;



    // デフォルトコンストラクタ
    public Staff() {}

    // 基本コンストラクタ
    public Staff(String staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }

    // フルコンストラクタ
    public Staff(String staffId, String name, String department, String position,
    		     int age, String gender, LocalDate dateOfHire, int employmentPeriod,
    		      String license, String certification, String remarks,
    		      Timestamp lastEvaluationDateAndTime) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
        this.position = position;
        this.age = age;
        this.gender = gender;
        this.dateOfHire = dateOfHire;
        this.employmentPeriod = employmentPeriod;
        this.license = license;
        this.certification = certification;
        this.remarks = remarks;
        this.lastEvaluationDateAndTime = lastEvaluationDateAndTime;
    }

    // Getters
    public String getStaffId() { return staffId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getPosition() { return position; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public LocalDate getDateOfHire() { return dateOfHire; }
    public int getEmploymentPeriod() { return employmentPeriod; }
    public String getLicense() { return license; }
    public String getCertification() { return certification;}
    public String getRemarks() { return remarks; }
    public Timestamp getLastEvaluationDateAndTime() { return lastEvaluationDateAndTime; }


    // Setters
    public void setStaffId(String staffId) { this.staffId = staffId; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setPosition(String position) { this.position = position; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }
    public void setDateOfHire(LocalDate dateOfHire) { this.dateOfHire = dateOfHire; }
    public void setEmploymentPeriod(int employmentPeriod) { this.employmentPeriod = employmentPeriod; }
    public void setLicense(String license) { this.license = license; }
    public void setCertification(String certification) { this.certification = certification; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
    public void setLastEvaluationDateAndTime(Timestamp lastEvaluationDateAndTime) { this.lastEvaluationDateAndTime = lastEvaluationDateAndTime; }

}
