package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE ="INVALID VALUE";

    public static void main(String[] args) {
	// write your code here

        int newScore =calculateScore("Pasindu",500);
        double value =calculateScores("Pasindu",500);

      calcFeetAndInches(72);
      String time= getDurationString(48,5678);
        System.out.println(time);
        System.out.println("New Score is " +newScore);
    }

    public static int calculateScore(String playerName,int score){
        System.out.println("Player " +playerName +" scored " +score+" points");
        return score*1000;
    }

    public static double calculateScores(String playerName,double score){
        System.out.println("Player " +playerName +" scored " +score+" points");
        return (score*1000.00);
    }


    public static void calcFeetAndInches(double feet, double inches){
        if(!(feet>=0) && (inches>=0 )&& (inches<=12)){
            System.out.println(-1);
        }else {
            double inchToCims =inches*2.54;
            double feetToCims =12*feet*2.54;

            double fullValue =inchToCims+feetToCims;

            System.out.println(fullValue);
        }
    }

    public static void calcFeetAndInches(double inches){
        if( inches<=0 ){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else {
            double feets =inches/12;
            double remInches =inches%12;
            calcFeetAndInches(feets,remInches);
        }
    }

    public static String getDurationString(int minutes,int secs){

        if(minutes>=0 && secs>=0 && secs <=59){
            int hours =minutes/60;
            int mins =minutes%60;

            return hours+"h "+mins+"m "+secs+"s";
        }else {
            return INVALID_VALUE_MESSAGE;
        }
    }
}
