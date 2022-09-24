package day4primitivedatatype;

public class BooleanChar {
    public static void main(String[] args) {

        char myChar = 'D';

        char myUnicode ='\u0044'; // apply unicode table to print character D/ We checked www.unicode-table.com found in table character D -  row 0040, collum 4 -> number of D is 0044. '\0044' - syntax to
        System.out.println(myChar);
        System.out.println(myUnicode);
        char copyRigth = '\u00A9';
        System.out.println(copyRigth);

        char ASCII = 68; // number of character D in ASCII
        System.out.println(ASCII);

        boolean myTrue = true;
        boolean myFalse = false;

        boolean isCustomerIsOverTwentyOne = true;
    }
}
