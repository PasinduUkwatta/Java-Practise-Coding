package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myVaribale =50;
        myVaribale++;
        myVaribale--;

        System.out.println("This is a test");
        System.out.println(myVaribale);

        System.out.println("this is "

        +"another "+
                "still more");

        boolean gameOver =false;
        int score =5000;
        int levelCompleted =5;
        int bonus =100;

        int highScore=calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println(highScore);

        System.out.println(displayHighScorePosition("Pasindu",1));
        System.out.println(displayHighScorePosition("Thiwanka",2));
        System.out.println(displayHighScorePosition("Deshan",3));

        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(900));
        System.out.println(calculateHighScorePosition(400));
        System.out.println(calculateHighScorePosition(500));
    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

        if(true){
            score=10000;
            levelCompleted=8;
            bonus=200;
            int lastScore =score+(levelCompleted*bonus);
            System.out.println(lastScore);

            return lastScore;
        }
        return -1;

    }

    public static String displayHighScorePosition(String playersName,int position){

        return (playersName+" get the "+ position + " position in the game");

    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }else if( playerScore>=500){

            return 2;
        }else if( playerScore>=100){

            return 3;
        }else {
            return 4;
        }
    }
}
 