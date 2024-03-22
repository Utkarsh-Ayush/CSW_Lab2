package Assignment1.Q9;

import java.util.ArrayList;
import java.util.List;

interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails();
}

class Enrollment implements EnrollmentSystem {
    @Override
    public void enrollStudent(Student student, Course course) {
        course.enrollStudent(student);
    }

    @Override
    public void dropStudent(Student student, Course course) {
        course.dropStudent(student);
    }

    @Override
    public void displayEnrollmentDetails() {
        course.displayEnrolledStudents();
    }

    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }
}

class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class Course {
    private String name;
    private int capacity;
    private List<Student> enrolledStudents;

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
        } else {
            throw new RuntimeException("Course is full.");
        }
    }

    public void dropStudent(Student student) {
        if (enrolledStudents.contains(student)) {
            enrolledStudents.remove(student);
        } else {
            throw new RuntimeException("Student is not enrolled in this course.");
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students in " + name + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName() + " (" + student.getId() + ")");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", 30);

        Enrollment enrollment = new Enrollment();
        enrollment.setCourse(course);

        Student student1 = new Student("John Doe", "12345");
        Student student2 = new Student("Jane Doe", "67890");

        try {
            enrollment.enrollStudent(student1, course);
            enrollment.enrollStudent(student2, course);
            enrollment.displayEnrollmentDetails();

            enrollment.dropStudent(student1, course);
            enrollment.displayEnrollmentDetails();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}