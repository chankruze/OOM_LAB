package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr04 {
    /**
     * Practical Number: 04
     * Task: Write a Java program to print the area and perimeter of a rectangle.
     */
    public static void main(String[] args) {
        // init variables
        Double a = 0.0, b = 0.0;
        int i = 0;

        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        // ask user to enter 2 sides of the rectangle (a & b)
//        System.out.print("Enter one side of the rectangle (a): ");
//        a = usrIn.nextDouble();
//        System.out.print("Enter the other side of the rectangle (b): ");
//        b = usrIn.nextDouble();

        // ask user to enter 2 sides of the rectangle (a & b)
        // additional validation for non zero value
        while (a == 0 || b == 0) {
            if (i != 0)
                System.out.println("A rectangle's side can't be 0, enter a non-zero value");

            if (a == 0) {
                System.out.print("Enter one side of the rectangle (a): ");
                a = usrIn.nextDouble();
            }

            if (b == 0) {
                System.out.print("Enter the other side of the rectangle (b): ");
                b = usrIn.nextDouble();
            }

            i++;
        }

        // show the result
        System.out.println("---RESULT---");
        System.out.println(MessageFormat.format("Area and perimeter of the given rectangle having side" +
                " a = {0} and b = {1} is {2} and {3} respectively.", a, b, a * b, 2 * (a + b)));
    }
}
