package day1;

public class UsingIfStatements {
    public static void main(String[] args) {
        int num = 72;

        if(num % 2 == 0){
            System.out.println(num + " is even.");
        }

        if(num%2 ==0)
            System.out.println("A");
            

        int score = 81;

        if(score >= 90){
            System.out.println("A+");
        } else if(score >= 80){
            System.out.println("A");
        } else if(score >= 70){
            System.out.println("B");
        } else if(score >= 60){
            System.out.println("C");
        } else if(score >= 50){
            System.out.println("D");
        } else{
            System.out.println("F");
        }   

        
    }
}
