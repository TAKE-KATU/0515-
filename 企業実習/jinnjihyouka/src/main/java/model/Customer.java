package model;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Customer {
    private String customerId;
    private String name;
    private int age;
    private String gender;
    private LocalDate dateOfHire;
    private int employmentPeriod;
    private String license;
    private String certification;
    private String remarks;
    private Timestamp lastEvaluationDateAndTime;
    private String evaluationUserId;



    // デフォルトコンストラクタ
    public Customer() {}

    // 基本コンストラクタ
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // フルコンストラクタ
    public Customer(String customerId, String name, int age, String gender,
    				LocalDate dateOfHire, int employmentPeriod,
    				String license, String certification, String remarks,
    				Timestamp lastEvaluationDateAndTime, String evaluationUserId) {
    	this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfHire = dateOfHire;
        this.employmentPeriod = employmentPeriod;
        this.license = license;
        this.certification = certification;
        this.remarks = remarks;
        this.lastEvaluationDateAndTime = lastEvaluationDateAndTime;
        this.evaluationUserId = evaluationUserId;
    }

    // Getters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public LocalDate getDateOfHire() { return dateOfHire; }
    public int getEmploymentPeriod() { return employmentPeriod; }
    public String getLicense() { return license; }
    public String getCertification() { return certification;}
    public String getRemarks() { return remarks; }
    public Timestamp getLastEvaluationDateAndTime() { return lastEvaluationDateAndTime; }
    public String getEvaluationUserId() { return evaluationUserId; }

    // Setters
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }
    public void setDateOfHire(LocalDate dateOfHire) { this.dateOfHire = dateOfHire; }
    public void setEmploymentPeriod(int employmentPeriod) { this.employmentPeriod = employmentPeriod; }
    public void setLicense(String license) { this.license = license; }
    public void setCertification(String certification) { this.certification = certification; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
    public void setLastEvaluationDateAndTime(Timestamp lastEvaluationDateAndTime) { this.lastEvaluationDateAndTime = lastEvaluationDateAndTime; }
    public void setEvaluationUserId(String evaluationUserId) { this.evaluationUserId = evaluationUserId; }
}
