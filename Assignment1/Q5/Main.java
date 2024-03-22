package Assignment1.Q5;

class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

    class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
    }
}

    public class Main {
    public static void main(String[] args) {
        College college1 = new College("College of Computer Science", "New York");
        College college2 = new College("College of Business", "Los Angeles");

        Student student1 = new Student(1, "John Doe", college1);
        Student student2 = new Student(2, "Jane Doe", college2);

        student1.displayStudentInfo();
        student2.displayStudentInfo();

        System.out.println("College Information:");
        System.out.println("College 1 Name: " + college1.getCollegeName());
        System.out.println("College 1 Location: " + college1.getCollegeLoc());
        System.out.println("College 2 Name: " + college2.getCollegeName());
        System.out.println("College 2 Location: " + college2.getCollegeLoc());
    }
}