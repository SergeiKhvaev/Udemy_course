package day9_code_block;

public class CodeBlock {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = 0;

        if(gameOver){
            System.out.println(score + (levelCompleted * bonus));
        }

    }
}
