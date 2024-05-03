package Assignment2part2.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User{
    private String name;
    private int age;

User(String name, int age){
    this.name = name;
    this.age = age;
}

public String getName(){
    return name;
}

public int getAge(){
    return age;
}
public void setName(String name){
    this.name = name;
}
public void setAge(int age){
    this.age = age;
}

public String toString(){
    return "Name: " + name + " Age: " + age;
}
}

public class ArrayListUser {
    public static void main(String[] args) {    
        // Creating an empty ArrayList 
        ArrayList<User> list = new ArrayList<User>();
       // Adding elements to the ArrayList
       list.add(new User("Utkarsh",21));
       list.add(new User("Komolika",22));
       list.add(new User("Rahul",20));
       list.add(new User("Chiru",19));
        // print before sorting
        System.out.println("List before sorting:");
       for(User user:list){
        System.out.println("Name:"+ user.getName()+" Age:"+user.getAge());
       }
       System.out.println("List after sorting:");
       //sorting users by age
       Collections.sort(list,Comparator.comparingInt(User::getAge));
       //print updated list
       for(User user:list){
        System.out.println("Name:"+ user.getName()+" Age:"+user.getAge());
       }
}
}
