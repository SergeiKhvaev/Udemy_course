package day3primitivedatatype;

import java.math.BigDecimal;

public class TaskWithDecimalce {
    public static void main(String[] args) {

        double pounds = 200;
        System.out.println(pounds);
        double kilograms = pounds * 0.45359237;
        System.out.println("200 pounds = " + kilograms);
        double PI = Math.PI;
        System.out.println(PI);

        System.out.println(BigDecimal.valueOf(10));


    }
}
