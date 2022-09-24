package day7TernaryOperator;

public class OperatorChallenge {
    public static void main(String[] args) {
        double a = 20.00;
        double b = 80;

        double c = a + b * 100;
        System.out.println(c);

        double d = c % 40;
        System.out.println(d);

        boolean isZero = false;

        if (d == 0) {
            isZero = true;
            System.out.println(isZero + " " + "rezult is ZERO");


        } else {

            System.out.println(isZero + " " + "result is NOT ZERO");
        }

    }
}
