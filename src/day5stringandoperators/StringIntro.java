package day5stringandoperators;

public class StringIntro {
    public static void main(String[] args) {
        /*
        1. byte
        2. short
        3. int
        4. long
        5. float
        6. double
        7. char
        8. boolean
         */

        String str = "This is a string";
        System.out.println("str equals " + str);
        str +=  ", and this is more";
        System.out.println(str);
       // System.out.println(str+= 'g');
        System.out.println(str += '\u00A9');
        System.out.println(str += 9); // String + int -> contacanation
String numericString = "99";
numericString += 9; // try to add int value 9 to numeric string
        System.out.println(numericString); // conpiler treat it like contacanation, because of sting (first part) is string, that means it is immutable
    }
}
