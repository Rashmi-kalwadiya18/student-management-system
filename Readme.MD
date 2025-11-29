# Student Management System

A simple console-based Student Management System built using Core Java.  
This project demonstrates basic OOP concepts, Java classes, and menu-driven programs.

## Features
- Add Student
- View All Students
- Search Student by ID
- Delete Student
- Add Course
- View All Courses
- Enroll Students in Courses
- View Enrollments

## Technologies Used
- Java (Core)
- OOP (Inheritance, Abstraction, Polymorphism, Encapsulation)
- Collections (ArrayList)

## Project Structure
src/com/airtripe/studentmanagement
├── entity
├── service
├── util
├── interfaces
└── main (Main.java – entry point)


## How to Run
1. Open the project in IntelliJ or any Java IDE.
2. Go to:  
   `src/com/airtripe/studentmanagement/main/Main.java`
3. Run the **Main** class.
4. Use the console menu to manage students and courses.

## UML Class Diagram
(paste the ASCII UML here)
# UML Class Diagram (ASCII)

                          +---------------------+
                          |     Person (abstract)|
                          +----------------------+
                          | - id : int           |
                          | - fullName : String  |
                          | - email : String     |
                          | - phoneNumber : String|
                          +----------------------+
                          | + getRole() : String |
                          +----------+-----------+
                                     |
                                     |
                        +------------+-------------+
                        |                          |
               +-------------------+     +----------------------+
               |     Student       |     |  GraduateStudent     |
               +-------------------+     +----------------------+
               | - courseName      |     | - researchTopic      |
               | - className       |     +----------------------+
               | - sectionName     |
               | - feesPaid : bool |
               +-------------------+
               | + calculateGrade()|
               | + matches()       |
               +---------+---------+
                         |
                         |
                +--------+----------+
                |   implements      |
                v                   v
        +---------------+    +------------------+
        |   Searchable  |    |    Gradeable     |
        +---------------+    +------------------+
        | +matches()    |    | +calculateGrade()|
        +---------------+    +------------------+

# Additional UML: Course, Enrollment, Services

+--------------------+          +---------------------+
|      Course        |          |     Enrollment      |
+--------------------+          +---------------------+
| - courseId : int   |          | - enrollmentId : int|
| - courseName       |          | - Student student   |
| - duration         |          | - Course course     |
| - instructorName   |          | - date : LocalDate  |
+--------------------+          | - status : String   |
| + matches()        |          +---------------------+
+---------+----------+          | +toString()         |
|                     +---------------------+
|
|
+------v--------+
|  Searchable   |
+---------------+


Service Layer
-------------

+-----------------------+
|   StudentService      |
+-----------------------+
| - students : List     |
+-----------------------+
| + addStudent()        |
| + viewAllStudents()   |
| + searchById()        |
| + deleteStudent()     |
+-----------------------+

+-----------------------+
|   CourseService       |
+-----------------------+
| - courses : List      |
+-----------------------+
| + addCourse()         |
| + viewAllCourses()    |
| + searchById()        |
+-----------------------+

+-----------------------+
|  EnrollmentService    |
+-----------------------+
| - enrollments : List  |
+-----------------------+
| + enrollStudent()     |
| + viewAllEnrollments()|
+-----------------------+



## Author
Rashmi Kalwadiya

