package day3primitivedatatype;

public class ChallengeWithPrimitiveDataTypes {
    public static void main(String[] args) {

        byte byteOne = 10;
        short shortOne = 20;
        int intOne = 50;
        long longeOne = 5000000000L + (byteOne + shortOne + intOne) * 10;
        System.out.println(longeOne);
short shortCasting = (short) (1000 + (byteOne + shortOne + intOne) * 10);//force java to consider summary like short data type


    }
}
