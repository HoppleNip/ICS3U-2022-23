package day5;

public class Question5 {
    public static void main(String[] args) {
        int wins = 110;
        int lost = 44;
        double  totalGames = wins + lost;

        double winPercentage = totalGames / wins;

        

       // winPercentage = Math.round(winPercentage * 1000) / 1000;

        System.out.println(winPercentage);

    }
}
