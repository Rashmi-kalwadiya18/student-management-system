package com.airtripe.studentmanagement.entity;
import com.airtripe.studentmanagement.interafces.Searchable;




public class Course implements Searchable{

    private int courseId;
    private String courseName;
    private String duration;          // e.g., "3 months"
    private String instructorName;

    @Override
    public boolean matches(String keyword) {
        return courseName.toLowerCase().contains(keyword.toLowerCase());
    }

    public Course(int courseId, String courseName, String duration, String instructorName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.instructorName = instructorName;
    }



    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                ", instructorName='" + instructorName + '\'' +
                '}';
    }
}
