import java.util.Scanner; //Input of the scanner this will make the input command here.

public class BasicSyntax {
    public static void main(String[] args) {
        //practicing the input of number  which is the int here.
       Scanner scanner = new Scanner(System.in); // This will be the input where I called the Scanner then name it scanner.
       // System.out.print("Enter your first number:");
       // int num1 = scanner.nextInt(); //This is a command to input the number here.
       // System.out.println("Your First number: " + num1);

        //Practicing the inputs of string here
        //System.out.println("First Name:");
        //String name = scanner.nextLine(); //This is for the next line input.
        //System.out.println("Hello " + name + "!");

        //Practicing the double where it was inputed
        //System.out.print("Input your GPA: ");
        //double gpa = scanner.nextDouble();

        // for boolean method
        //System.out.print("Are you a student? (True/False): ");
        //boolean isStudent = scanner.nextBoolean();


        //Expected out put
        //System.out.println("Your GPA: " + gpa);
        //System.out.println("Student: " + isStudent);

        //if(isStudent){
       //     System.out.println("You are a student!");
        //}else {
         //   System.out.println("You are not a student.");
        //}

        System.out.println("Enter details below:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); //When you experience when it show directly without inputing the others here. This is to remove the input buffer.

        System.out.print("Fave color: ");
        String color = scanner.nextLine();

        System.out.println("Your name is " + name + ". Your age is " + age + " years old.");
        System.out.println("Your favorite color is " + color +".");

        scanner.close(); //This part is to close the scanner part.
    }
}
