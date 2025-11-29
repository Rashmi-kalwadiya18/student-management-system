package com.airtripe.studentmanagement.service;

import com.airtripe.studentmanagement.entity.Course;
import java.util.ArrayList;
import java.util.List;



public class CourseService {

    private List<Course> courses = new ArrayList<>();


    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added successfully!");
    }


    public void viewAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (Course course : courses) {
            System.out.println(course);
        }
    }


    public Course searchById(int courseId) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        return null;
    }


    public List<Course> searchByName(String name) {
        List<Course> result = new ArrayList<>();

        for (Course course : courses) {
            if (course.getCourseName().equalsIgnoreCase(name)) {
                result.add(course);
            }
        }
        return result;
    }


    public boolean updateCourse(int id, String newName, String newDuration, String newInstructor) {
        Course course = searchById(id);

        if (course == null) {
            return false;
        }

        course.setCourseName(newName);
        course.setDuration(newDuration);
        course.setInstructorName(newInstructor);
        return true;
    }


    public boolean deleteCourse(int id) {
        Course course = searchById(id);

        if (course != null) {
            courses.remove(course);
            return true;
        }

        return false;
    }
}
