package day3primitivedatatype;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        int minValue = Integer.MIN_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        short minShort = Short.MIN_VALUE;

        int myTotal = minValue / 2; // use int by default -that why no problem

        byte myNewByte = (byte) (minByteValue /2); // by default java look for int, that why need extra action to force java operate byte data type -> we use casting data type

        short myNewShort = (short) (minShort / 2); // by default java look for int, that why need extra action to force java operate short data type -> we use casting data type

        byte b =  100;
        int a = b; // automate casting if smaller data type tut in bigger data type

        int c = 124;
        byte d = (byte) c; // need use casting when we try to put variable defined like bigger data type to smaller data type
    }
}
