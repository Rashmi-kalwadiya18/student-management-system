package com.airtripe.studentmanagement.entity;

public abstract class Person {

    private int id;
    private String fullName;
    private String email;
    protected String phoneNumber;
    public static int count =0;




    public Person(int id, String fullName, String email, String phoneNumber)
    {

        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        count++;
    }



    public abstract String getRole();


    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
