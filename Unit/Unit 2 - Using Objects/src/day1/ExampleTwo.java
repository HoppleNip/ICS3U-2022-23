package day1;

public class ExampleTwo {
    public static void main(String[] args) {


        String s1 = new String("happy");
        String s2 = new String("happy");
        String s3 = new String("HAPPY");

        String s4 = "happy";
        String s5 = "happy";
        int x = 7;
        int y = 7;

        System.out.println(s1 == s2); //false
        System.out.println(x == y); // true

        System.out.println(s1.equals(s1)); // true equals method compares the actual objects
        System.out.println(s2.equals(s3)); 

        System.out.println(s4 == s5);  // true string literals are special and have the same address.

        System.out.println(s1 == s4);

    }
}
