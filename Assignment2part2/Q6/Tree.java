package Assignment2part2.Q6;

import java.util.Scanner;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<Integer> set =new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        //display the tree set
        System.out.println("Tree set: " + set);

        //Ask the user to enter the number
        System.out.println("Enter the number to be searched:");
        Scanner sc=new Scanner(System.in);
        int search = sc.nextInt();
        boolean containsNumber = set.contains(search);
        System.out.println("Is " + search + " present in the set? " + containsNumber);

        //remove an element
        System.out.println("Enter the number to remove:");
       
        int x=sc.nextInt();
        set.remove(x);
        System.out.println("Tree set after removing " + set);
        sc.close();
    }

    
}
