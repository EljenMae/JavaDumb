import java.util.Scanner; //Input of the scanner this will make the input command here.

public class BasicSyntax {
    public static void main(String[] args) {
        //practicing the input of number here.
        Scanner scanner = new Scanner(System.in); // This will be the input where I called the Scanner then name it scanner.
        System.out.print("Enter your first number:");
        int num1 = scanner.nextInt(); //This is a command to input the number here.
        System.out.println("Your First number: " + num1);

        //Practicing the inputs of string here
        System.out.println("First Name:");
        String name = scanner.nextLine(); //This is for the next line input.
        System.out.println("Hello " + name + "!");
        scanner.close(); //This part is to close the scanner part.
    }
}
