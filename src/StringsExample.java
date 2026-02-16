import java.util.Scanner;

public class StringsExample {
    public static void main(String[] args){
        //creating the string
        String MyString = new String ("Hello world!");
        System.out.println(MyString);

        //Short way String set up
        String newString = "Hello Another world";
        System.out.println(newString);

        //Escape characters
        String characters = "\\Hell world"; // This will print a single backslash
        String characters1 = "Hell world\t"; // Adds a single tab character
        String characters2 = "Hell world\r"; // Carriage return (moves cursor to start of line)
        String characters3 = "Hell world\n"; // New line of character

        System.out.println(characters);
        System.out.println(characters1);
        System.out.println(characters2);
        System.out.println(characters3);

        //String as Contants
        String newWorld = "hello to hell";
        String newWorld1 = "hello to hell again";
        System.out.println(newWorld);
        System.out.println(newWorld1);

        //String as Singletons
        String myString1 = new String("Hello World");
        String myString2 = new String("Hello World");
        System.out.println(myString1);
        System.out.println(myString2);

        //Java textblocks
        String textblock = """
                   This is a text inside a
                   text block.
                   You can use "quotes" in here
                   without escaping them.
                   """;
        System.out.println(textblock);

        String newBlocks = """
                This is the new
                block.
                """;
        System.out.println(newBlocks);

        //Java string blocks

        String block1 = """
                This new block
                """;
        String block2= """
                This 2nd block
                """;
        String block3= """
                This 3rd block
                """;
        System.out.println(block1);
        System.out.println(block2);
        System.out.println(block3);

        //Concat
        //basic
        String word1 ="hello";
        String word2 ="world";

        //System.out.println(word1 + " " + word2);

        //string contcat performance
        String word3 = new StringBuilder(word1).append(word2).toString();
        System.out.println(word3);

        //string loop concat
        String[] allStrings= new String[]{"Ten","Twenty", "Thirty"};
        String result1 = "five"; //calling the null in the string

        //loop for the string
        for (String string:allStrings){
            result1 = result1 + allStrings;
           System.out.println(result1);
        }





    }
}
