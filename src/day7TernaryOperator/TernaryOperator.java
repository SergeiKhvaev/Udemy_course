package day7TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {

        int age = 19;

        boolean isEligable = age>=18 ? true : false;

        System.out.println(isEligable);

        String voiter = age >= 18 ? "Eligable to voit" : "Not Eligable to voit, age under 18";
        System.out.println(voiter);

    }
}
