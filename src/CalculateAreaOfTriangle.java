import java.util.Scanner;

public class CalculateAreaOfTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;


        //Calculating the area of the triangle
        System.out.println("Getting the area of a triangle.");

        System.out.print("Width: ");
        width = scanner.nextDouble();

        System.out.print("Height: ");
        height = scanner.nextDouble();

        //Calculating the area only
        area = width * height * 5.0;

        //Expected output
        System.out.println("Area: " + area + " cm");

        scanner.close();
    }
}
