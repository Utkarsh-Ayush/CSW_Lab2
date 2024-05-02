package Assignment2.Q1;

class Student<T> {
    String name;
    T rollno;
    int age;

    Student(String name, T rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public T getRollno() {
        return rollno;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(T rollno) {
        this.rollno = rollno;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class driver {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<>("Utkarsh", 3, 20);
        Student<String> s2= new Student<>("Komolika","49",20);
        System.out.println(s1+"\n"+s2);
    }
}
