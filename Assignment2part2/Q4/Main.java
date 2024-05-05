package Assignment2part2.Q4;

import java.util.LinkedList;
import java.util.Scanner;

class Student{
    String name;
    int age;
    double mark;
    Student(String name, int age, double mark){
    this.name=name;
    this.age=age;
    this.mark=mark;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> list=new LinkedList<>();
        list.add(new Student("Utkarsh", 21, 85.5));
        list.add(new Student("Komolika", 22, 78.0));
        list.add(new Student("Raool", 20, 92.3));

        // Display the list
        System.out.println("Student List:");
        for (Student student : list) {
            System.out.println(student);
        }
        // to search the student
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student to be serached:");
        String n=sc.nextLine();
        System.out.println("Enter the age of the Student:");
        int a=sc.nextInt();
        System.out.println("Enter the marks of the student:");
        double m=sc.nextDouble();
        Student found=new Student(n, a, m);
        sc.close();
        
            if(list.contains(found)){
                System.out.println("Student found");
            }
            else{
                System.out.println("Student not found.");
            }

        
        //to delete the student
        list.remove(found);
        System.out.println("Student object removed");

        //result after removing the object
        for (Student student : list) {
            System.out.println(student);
        }
    }
}

    

