package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        // mathematical expression evaluate to a number
      // logical and boolean expressions evaluate to TRUE and/or FALSE

      // Logical Operators: >, <, >=, <=, ==, !=

      System.out.println(6 < 9);
      System.out.println(7 != 8);
      boolean test = 7 >= 9;
      System.out.println(!test);

      boolean isHarder = (7 > 3) == ("red".equals("blue"));    //true == false = false
      boolean isNotAsHard = (9 <=3) != (5 == 7);


      // Compound Boolean Expressions
      // AND (&&), OR (||), NOT (!)

      boolean isRed = true;
      boolean isBig = true;
      boolean isDog = true;

      boolean isClifford = isRed && isBig && isDog;

      String str = null;

      boolean exp = str != null && str.length() > 3;


    }

}
