package day4;

public class Question5 {
    public static void main(String[] args) {
        double pennie = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;
        int loonie = 1;
        int toonie = 2;

        int numPennies = 10;
        int numNickels = 20;
        int numDime = 30;
        int numQuarter = 40;
        int numLoonie = 50;
        int numToonie = 69;

        double totalMoney = (numPennies * pennie) + (numNickels * nickel) + (numDime * dime) + (numQuarter * quarter) + (numLoonie * loonie) + (numToonie * toonie);

        System.out.println("$" + totalMoney);

    }
}
