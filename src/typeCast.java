import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class typeCast {
    public static void main (String[] args){

        //Topic: Type casting in JAVA
        // This is converting int to double
        int num = 50;
        System.out.println("This is int: " + num);

        //Changing the number
        double newNum = num;
        System.out.println("This become a double num: " + newNum);

        //End of converting int to double

        //Converting double to int
        double newNumber = 50.99;
        System.out.println("Double: " + newNumber);

        //Starting to convert this to int
        int newNumberConvert = (int)newNumber; // This part it should have a (int) so it will automatically converted
        System.out.println("Int: " + newNumberConvert);

        //This will be the int convert to string:
        System.out.println("This is int: " + num);

        String numberString = String.valueOf(num); // This will be the command to be converted
        System.out.println("This is String: " + numberString);

        //Reverse of string to int
        System.out.println("Reverse");
        int stringToNum = Integer.parseInt(numberString);
        System.out.println("This is become Int: " + stringToNum);

    }
}
