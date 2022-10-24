package cow;

public class trutel {
    public static void main(String[] args) {
        
        
        System.out.println(sqrtSum(72341));
        

       
}

public static double sqrtSum(int number){
    int firstDigit = number / 10000;
    int thirdDigit = number % 1000 / 100;
    int fifthDigit = number % 10;

    int sum = firstDigit + thirdDigit + fifthDigit;

    double sqrtSum = Math.sqrt(sum);

    return sqrtSum;
}
}
