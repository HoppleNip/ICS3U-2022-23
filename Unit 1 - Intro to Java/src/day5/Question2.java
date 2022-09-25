package day5;

public class Question2 {
    public static void main(String[] args) {
        double length = 4.5;
        double width = 2.3;

        double area = length * width;
        double perimeter = (length * 2 ) + (width * 2);


        area = Math.round(area * 10) / 10;
        perimeter = Math.round(perimeter * 10) / 10;



        System.out.println(area);
        System.out.println(perimeter);
    }
}
