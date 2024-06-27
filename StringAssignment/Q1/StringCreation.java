package StringAssignment.Q1;

public class StringCreation {
    public static void main(String[] args) {
        //using string literals
        String s1 = "Hello";
        String s2 = "Hello";

        //using new keyword
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        //memory location implication
        System.out.println(s1 == s2);  //true
        System.out.println(s3 == s4);  //false

        //stirng comparision
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

    
    }

}
