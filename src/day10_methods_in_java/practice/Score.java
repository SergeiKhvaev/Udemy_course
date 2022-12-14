package day10_methods_in_java.practice;

public class Score {

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position "+ position + " on the high score table");
    }


    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }else if (score >= 500){
            return 2;
        }else if (score >= 100){
            return 3;
        }
        return 4;
    }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Sergei", highScorePosition);
        System.out.println("==============================================");
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Eva", highScorePosition);
        System.out.println("==============================================");

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Katy", highScorePosition);
        System.out.println("==============================================");

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tom", highScorePosition);
    }
}
