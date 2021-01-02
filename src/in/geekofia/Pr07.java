package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr07 {
    /**
     * Practical Number: 07
     * Task: Write a Java program to compare two numbers.
     */
    public static void main(String[] args) {
        // init variables
        Double firstNum, secondNum, diff;

        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        firstNum = usrIn.nextDouble();
        System.out.print("Enter second number (b): ");
        secondNum = usrIn.nextDouble();

        // compare both
        diff = firstNum - secondNum;

        // show the result
        System.out.println("\n---RESULT---");

        if (diff == 0)
            System.out.println(MessageFormat.format("{0} and {1} are same", firstNum, secondNum));
        else if (diff > 0)
            System.out.println(MessageFormat.format("{0} is greater than {1}", firstNum, secondNum));
        else
            System.out.println(MessageFormat.format("{0} is smaller than {1}", firstNum, secondNum));
    }
}
