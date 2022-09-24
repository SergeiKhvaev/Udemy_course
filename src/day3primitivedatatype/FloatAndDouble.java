package day3primitivedatatype;

public class FloatAndDouble {
    public static void main(String[] args) {


        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        float a = (float)5.25;// or just put F after

        double b = 5.25;

        int a1 = 5 / 2; // we will lost value - what is not whole number, because output will be int
        float b1 = 5 / 2f;// can t just divide by 2(compiler consider 2 as int), so we force java to consider 2 as float
        double c1 = 5 / 2d; // can t just divide by 2(compiler consider 2 as int), so we force java to consider 2 as double or put 2.0. Will have more precise  output because of double

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);



    }
}
