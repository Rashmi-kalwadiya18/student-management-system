package com.airtripe.studentmanagement.entity;

import com.airtripe.studentmanagement.interafces.Grade;


public class GraduateStudent extends Student implements Grade {

    private String graduationProject;

    @Override
    public int calculateGrade() {
        // Graduate students score slightly higher
        return 90;
    }


    public GraduateStudent(int id,
                           String fullName,
                           String email,
                           String phoneNumber,
                           String courseName,
                           String className,
                           String sectionName,
                           boolean feesPaid,
                           String graduationProject) {

        super(id, fullName, email, phoneNumber, courseName, className, sectionName, feesPaid);

        this.graduationProject = graduationProject;
    }

    @Override
    public String getRole() {
        return "Graduate Student";
    }

    public String getGraduationProject() {
        return graduationProject;
    }

    public void setGraduationProject(String graduationProject) {
        this.graduationProject = graduationProject;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", courseName='" + getCourseName() + '\'' +
                ", className='" + getClassName() + '\'' +
                ", sectionName='" + getSectionName() + '\'' +
                ", feesPaid=" + isFeesPaid() +
                ", graduationProject='" + graduationProject + '\'' +
                '}';
    }
}
