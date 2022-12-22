package gofish;

import java.util.Scanner;

public class GoFishTwo {
    static Scanner in = new Scanner(System.in);
    private static String player1Hand = "";
    private static String player2Hand = "";
    private static String player3Hand = "";
    private static String player4Hand = "";
    private static final String HEARTS = "H";
    private static final String CLUBS = "C";
    private static final String SPADES = "S";
    private static final String DIAMONDS = "D";
    private static final String JACK = "J";
    private static final String ACE = "A";
    private static final String QUEEN = "Q";
    private static final String KING = "K";
    private static final int NUM_VALUES = 13;
    private static int PLAYER1_SCORE = 0;
    private static int PLAYER2_SCORE = 0;
    private static int PLAYER3_SCORE = 0;
    private static int PLAYER4_SCORE = 0;
    private static final int NUM_SUITS = 4;
    public static void main(String[] args) {
        player1Hand = getCard() + " " + getCard() + " " + getCard() + " " + getCard() + " " + getCard();
        player2Hand = getCard() + " " + getCard() + " " + getCard() + " " + getCard() + " " + getCard();
        player3Hand = getCard() + " " + getCard() + " " + getCard() + " " + getCard() + " " + getCard();
        player4Hand = getCard() + " " + getCard() + " " + getCard() + " " + getCard() + " " + getCard();

        displayHand(player1Hand, false, "Your Hand: ");
        displayHand(player2Hand, false, "Player 2 Hand: ");
        displayHand(player3Hand, false, "Player 3 Hand: ");
        displayHand(player4Hand, false, "Player 4 Hand: ");

        player1Hand = getScore(player1Hand,1);

        askCard();
            
    }

    private static void askCard(){
        System.out.println("Choose a player to ask for a card");
        System.out.print("(2) for Player 2, (3) for player 3, and (4)for player 4: ");
        String playerSelect = in.nextLine();

        if(playerSelect.equals("2")){
            System.out.println("Which of your cards would you like to ask for: " + player1Hand);
            String cardSelect = in.nextLine().toLowerCase();
            System.out.println(cardSelect);
            player1Hand = player1Hand.replace("10", "t");
            if(player1Hand.toLowerCase().contains(cardSelect)){
                if(player2Hand.toLowerCase().contains(cardSelect)){
                    String toReplace = "";
                    for (int i = 0; i < player2Hand.length() - 1; i++) {
                        char currentChar = player2Hand.toLowerCase().charAt(i);
                        if(("" +currentChar).equals(cardSelect)){
                            toReplace += currentChar;
                            if(i + 1 < player2Hand.length() - 1) {
                                toReplace += player2Hand.charAt(i + 1);
                                if(i + 2 < player2Hand.length() - 1) {
                                    toReplace += " ";
                                }
                            }
                        }
                        
                    }
                    player2Hand = player2Hand.replace(toReplace.toUpperCase(), "");
                    System.out.println(player2Hand);
                } else {
                    System.out.println("GO FISH");
                    System.out.println("Drawing a card....");
                    player1Hand += getCard();
                    System.out.println(player1Hand);
                }
            } else {
                System.out.println("Please enter a valid input...");
                askCard();
            }
        } else if(playerSelect.equals("3")){
            
            
        } else if(playerSelect.equals("3")){
            
        } else {
            System.out.println("Please enter a valid input...");
            askCard();
            return;
        }


    }

    private static String getScore(String playerHand, int player) {
        int score = 0;
        String values = "12345678910JQKA";
    
        
        for(int i = 0; i < playerHand.length(); i++){
            String cardNum = playerHand.substring(i, (i+1));
            String afterNum = playerHand.substring(i + 1);

            if(values.indexOf(cardNum) > -1){
                if(afterNum.indexOf(cardNum) > -1){
                    if(player == 1) {
                        PLAYER1_SCORE++;
                        System.out.println("Your Score is: " + PLAYER1_SCORE);
                    } else if(player == 2) {
                        PLAYER2_SCORE++;
                    } else if(player == 3) {
                        PLAYER3_SCORE++;
                    } else if(player == 4) {
                        PLAYER4_SCORE++;
                    }
                    playerHand = removeDupe(i, playerHand, cardNum,player);
                }
            }
        }
       
        return playerHand;
    }


    private static String removeDupe(int i, String playerHand, String cardNum, int player){
    
        int cardIndex = playerHand.indexOf(cardNum);
        String j = playerHand.substring(0, i);
        String k;

        if(i == 10){
            k = playerHand.substring(cardIndex + 4);
        } else {
            k = playerHand.substring(cardIndex + 3);
        } 

        String ONE_DUPE_REMOVED = j + k;
        
        System.out.println(ONE_DUPE_REMOVED);

        String m = "";
        String f = ONE_DUPE_REMOVED.substring(0,cardIndex);
        if(cardIndex + 3  > playerHand.length() - 1){
            m = ONE_DUPE_REMOVED.substring(cardIndex + 2);
        } else  {
            m = ONE_DUPE_REMOVED.substring(cardIndex + 3);
        }
       
        System.out.println(f + m);

        String realHand = f + m;

        playerHand = realHand;

        return playerHand;


    }

    private static String getValue() {
        int iValue = (int) (Math.random() * NUM_VALUES) + 1;
  
        if (iValue   == 1)
           return ACE;
        else if (iValue == 11)
           return JACK;
        else if (iValue == 12)
           return QUEEN;
        else if (iValue == 13)
           return KING;
        else
           return "" + iValue;
     }

     private static String getSuit() {
        int iSuit = (int) (Math.random() * NUM_SUITS) + 1;
  
        if (iSuit == 1)
           return HEARTS;
        else if (iSuit == 2)
           return SPADES;
        else if (iSuit == 3)
           return CLUBS;
        else
           return DIAMONDS;
  
     }
     private static String getCard() {
        return getValue() + getSuit();
     }

     private static String displayHand(String cards, boolean isHidden, String label) {
        String result = "";
        if (isHidden)
           result += label + "XX " + cards;
        else
           result += label + cards;
  
        System.out.println(result);
        return result;
     }
    }



 


