package day10_methods_in_java;

public class MethodsIntro {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        caclulateScoreOne(true, 800, levelCompleted, bonus);
        caclulateScoreOne (true, 10000, 8, 200);

    }



    public static void caclulateScoreOne(boolean gameOver, int score, int levelCompleted, int bonus){// do not send anything back - void (пустой) method , if we need method send any variable back and we can use it, need to apply methods, which return needed variable back and we can reuse it

        if(gameOver){
            int finalScore = score +(levelCompleted * bonus);
            finalScore += 1000;
                System.out.println("Final score was  " +  finalScore);
            }
        }

    public static int caclulateScoreTwo(boolean gameOver, int score, int levelCompleted, int bonus) {// do not send anything back - void (пустой) method , if we need method send any variable back and we can use it, need to apply methods, which return needed variable back and we can reuse it

        if (gameOver) {
            int finalScore = 0;
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final score was  " + finalScore);
            return finalScore; // return actual result if gameOver is true!!!
        }
            return -1; // but we need to return sumething if gameOver is false, otherwaise method will works not correctly, ond will return value only if gameOver is true. in convention -1 defines error,  invalid value or value not fount
        }
    }



