package day6_if_else_statment;

public class day6if_els_statment {
    public static void main(String[] args) {


        boolean isAlien = false;

        if(isAlien == true){ // we use == equals logical operator (isAlien (abbriviation)) // check if initial variable is Alien is false or not false -> so, if alian = false, then isAlien == false is true // == - это логический оператор, он не проводит переассайн, он только проверяет если операнды в if statment равны или нет -> ==
            System.out.println("is Alien");
        } else{
            System.out.println(" not Alien");
        }

       if(isAlien = true){ // here we esed = - assighn operator, so we just re-assigned isAlien from false to true, then if statment became true automatically (here = reassign operator works because operand isAlien is boolean. BUT in IF statment properly use only logical (не арифметические operators
            System.out.println("is Alien");
        } else{
            System.out.println("not Alien");
        }


        boolean isAlienSecond = false;

        if(isAlienSecond){ // abbriviation/ shortcut
            System.out.println("is Alien");
        } else{
            System.out.println("not Alien");
        }



    }


}
