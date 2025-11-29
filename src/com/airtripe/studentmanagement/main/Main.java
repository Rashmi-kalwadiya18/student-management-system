package com.airtripe.studentmanagement.main;

import com.airtripe.studentmanagement.entity.Course;
import com.airtripe.studentmanagement.entity.Student;
import com.airtripe.studentmanagement.entity.GraduateStudent;
import com.airtripe.studentmanagement.service.StudentService;
import com.airtripe.studentmanagement.service.CourseService;
import com.airtripe.studentmanagement.service.EnrollmentService;
import com.airtripe.studentmanagement.util.DateUtil;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Course");
            System.out.println("6. View All Courses");
            System.out.println("7. Enroll Student");
            System.out.println("8. View Enrollments");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1: // Add Student
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Full Name: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();

                    System.out.print("Enter Class Name: ");
                    String className = scanner.nextLine();

                    System.out.print("Enter Section Name: ");
                    String section = scanner.nextLine();

                    System.out.print("Fees Paid (true/false): ");
                    boolean feesPaid = scanner.nextBoolean();

                    Student student = new Student(id, fullName, email, phone,
                            courseName, className, section, feesPaid);

                    studentService.addStudent(student);
                    break;

                case 2: // View Students
                    studentService.viewAllStudents();
                    break;

                case 3: // Search Student
                    System.out.print("Enter Student ID: ");
                    int searchId = scanner.nextInt();

                    Student found = studentService.searchById(searchId);
                    System.out.println(found != null ? found : "Student not found.");
                    break;

                case 4: // Delete Student
                    System.out.print("Enter Student ID: ");
                    int deleteId = scanner.nextInt();

                    boolean deleted = studentService.deleteStudent(deleteId);
                    System.out.println(deleted ? "Deleted!" : "Student not found.");
                    break;

                case 5: // Add Course
                    System.out.print("Enter Course ID: ");
                    int cid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Course Name: ");
                    String cname = scanner.nextLine();

                    System.out.print("Enter Duration: ");
                    String duration = scanner.nextLine();

                    System.out.print("Enter Instructor Name: ");
                    String instructor = scanner.nextLine();

                    Course course = new Course(cid, cname, duration, instructor);
                    courseService.addCourse(course);
                    break;

                case 6: // View Courses
                    courseService.viewAllCourses();
                    break;

                case 7: // Enroll Student
                    System.out.print("Enter Enrollment ID: ");
                    int eid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Student ID: ");
                    int sid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Course ID: ");
                    int coid = scanner.nextInt();
                    scanner.nextLine();

                    Student s = studentService.searchById(sid);
                    Course c = courseService.searchById(coid);

                    if (s == null || c == null) {
                        System.out.println("Invalid Student or Course ID.");
                        break;
                    }

                    LocalDate date = DateUtil.today();

                    enrollmentService.enrollStudent(eid, s, c, date, "Active");
                    break;

                case 8: // View Enrollments
                    enrollmentService.viewAllEnrollments();
                    break;

                case 0:
                    System.out.println("Exiting System...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
