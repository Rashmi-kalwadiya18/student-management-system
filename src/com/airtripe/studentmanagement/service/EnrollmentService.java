package com.airtripe.studentmanagement.service;

import com.airtripe.studentmanagement.entity.Course;
import com.airtripe.studentmanagement.entity.Enrollment;
import com.airtripe.studentmanagement.entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class EnrollmentService {

    private List<Enrollment> enrollments = new ArrayList<>();


    public void enrollStudent(int enrollmentId,
                              Student student,
                              Course course,
                              LocalDate date,
                              String status) {

        Enrollment enrollment = new Enrollment(enrollmentId, student, course, date, status);
        enrollments.add(enrollment);

        System.out.println("Enrollment created successfully!");
    }


    public void viewAllEnrollments() {
        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }

        for (Enrollment e : enrollments) {
            System.out.println(e);
        }
    }


    public Enrollment searchById(int id) {
        for (Enrollment e : enrollments) {
            if (e.getEnrollmentId() == id) {
                return e;
            }
        }
        return null;
    }


    public List<Enrollment> searchByStudentName(String studentName) {
        List<Enrollment> result = new ArrayList<>();

        for (Enrollment e : enrollments) {
            if (e.getStudent().getFullName().equalsIgnoreCase(studentName)) {
                result.add(e);
            }
        }

        return result;
    }


    public boolean updateEnrollmentStatus(int id, String newStatus) {
        Enrollment e = searchById(id);

        if (e == null) {
            return false;
        }

        e.setStatus(newStatus);
        return true;
    }

    public boolean deleteEnrollment(int id) {
        Enrollment e = searchById(id);

        if (e != null) {
            enrollments.remove(e);
            return true;
        }

        return false;
    }
}
