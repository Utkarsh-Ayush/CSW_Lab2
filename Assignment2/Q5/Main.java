package Assignment2.Q5;

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
        return Integer.compare(this.rollno, other.rollno);

        
    }
    @Override
    public String toString(){
        return "Name: "+this.name+"\nRollno: "+this.rollno+"\nTotalMark: "+this.totalMark; 
    }
}       

public class Main {
    public static void main(String[] args) {
        Student [] students=new Student[2];
        students[0]=new Student("Utkarsh",3,90);
        students[1]=new Student("Komolika",2,80);

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap elements
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted by rollno:");
        for(Student s:students){
            System.out.println(s);
        }
    }
    
    
}
