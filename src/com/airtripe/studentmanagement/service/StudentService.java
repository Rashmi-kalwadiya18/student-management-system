package com.airtripe.studentmanagement.service;

import com.airtripe.studentmanagement.entity.Student;
import java.util.ArrayList;
import java.util.List;



public class StudentService {

    private List<Student> students = new ArrayList<>();


    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }


    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }


    public Student searchById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public List<Student> searchByName(String name) {
        List<Student> result = new ArrayList<>();

        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }

        return result;
    }


    public boolean updateStudent(int id, String newEmail, String newPhone) {
        Student student = searchById(id);

        if (student == null) {
            return false;
        }

        student.setEmail(newEmail);
        student.setPhoneNumber(newPhone);
        return true;
    }


    public boolean deleteStudent(int id) {
        Student student = searchById(id);

        if (student != null) {
            students.remove(student);
            return true;
        }

        return false;
    }
}
