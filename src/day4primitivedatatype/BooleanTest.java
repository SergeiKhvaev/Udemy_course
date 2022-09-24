package day4primitivedatatype;

public class BooleanTest {

    public static void main(String[] args) {

        boolean isCar = false;

        if(isCar){ // nothing to print we check if car ie true, but car defined as false
            System.out.println("is car");
        }

if(!isCar){// print Not car! because we check isCar is false (!isCar). isCar we defined as false -> so output is true-> print Not car!
    System.out.println("Not car!");
}

    }
}
