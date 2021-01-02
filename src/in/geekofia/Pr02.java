package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr02 {
    /**
     * Practical Number: 02
     * <p>
     * Task: Write a Java program to print the sum of two numbers.
     */
    public static void main(String[] args) {
        // init variables
        Double firstNum, secondNum;
        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        // message to ask user for first num
        System.out.print("Enter First Number: ");
        // store first number
        firstNum = usrIn.nextDouble();

        // message to ask user for second num
        System.out.print("Enter First Number: ");
        // store second number
        secondNum = usrIn.nextDouble();

        // show the result
        System.out.println("---RESULT---");
        System.out.println(MessageFormat.format("Sum of {0} and {1} is {2}", firstNum, secondNum, firstNum + secondNum));
    }
}
