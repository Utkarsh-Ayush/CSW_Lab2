package Assignment2.Q4;
class Student implements Comparable<Student>{
    String name;
    int rollno;
    double totalMark;
    Student(String name, int rollno, double totalMark){
        this.name=name;
        this.rollno=rollno;
        this.totalMark=totalMark;
    }
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.rollno, other.rollno);
    }
    @Override
    public String toString(){
        return "Name: "+this.name+"\nRollno: "+this.rollno+"\nTotalMark: "+this.totalMark;
    }
    public static Student LinearSearch(Student [] students, double targetrollNo ){
        for(Student student:students){
            if(student.rollno==targetrollNo){
                return student;
            }
        }
        return null;
    }

}
public class Main {
    public static void main(String [] args) {
        Student [] students = new Student[2];
        students[0] = new Student("Utkarsh", 1, 90);
        students[1] = new Student("Komolika", 2, 80);
        int targetrollNo=2;
        Student student = Student.LinearSearch(students, targetrollNo);
        if(student!=null){
            System.out.println(student);
        }
        else{
            System.out.println("Student not found");
        }
    }
    
}
