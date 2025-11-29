package com.airtripe.studentmanagement.entity;
import com.airtripe.studentmanagement.interafces.Searchable;
import com.airtripe.studentmanagement.interafces.Grade;


public class Student extends Person implements Searchable, Grade{

    private String courseName;
    private String className;
    private String sectionName;
    private boolean feesPaid;

    @Override
    public int calculateGrade() {
        // Simple grade logic based on feesPaid
        return feesPaid ? 80 : 50;
    }

    @Override
    public boolean matches(String keyword) {
        return getFullName().toLowerCase().contains(keyword.toLowerCase());
    }

    public Student(int id, String fullName, String email, String phoneNumber, String courseName, String className, String sectionName, boolean feesPaid
    ) {
        super(id, fullName, email, phoneNumber);  // Parent constructor called
        this.courseName = courseName;
        this.className = className;
        this.sectionName = sectionName;
        this.feesPaid = feesPaid;
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public boolean isFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(boolean feesPaid) {
        this.feesPaid = feesPaid;
    }

    @Override
    public String getRole() {
        return "Student";
    }




}
