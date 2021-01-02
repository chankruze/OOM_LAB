package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr05 {
    /**
     * Practical Number: 05
     * Task: Write a Java program to swap two variables.
     */
    public static void main(String[] args) {
        // init variables
        Double firstNum, secondNum, firstNumShadow, secondNumShadow;
        char swapChoice;
        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        firstNum = usrIn.nextDouble();
        System.out.print("Enter second number (b): ");
        secondNum = usrIn.nextDouble();
        System.out.print("Swap using temp variable ? [y/N]: ");
        swapChoice = Character.toLowerCase(usrIn.next().charAt(0));

        // store first & second number before swapping to show in results
        firstNumShadow = firstNum;
        secondNumShadow = secondNum;

        if (swapChoice == 'y') {
            // swapping using temp variable
            Double temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        } else {
            // swapping without using temp variable
            firstNum += secondNum;
            secondNum = firstNum - secondNum;
            firstNum = firstNum - secondNum;
        }

        // show the result
        System.out.println("\n---RESULT---");
        System.out.println(MessageFormat.format("Before swapping a = {0}, b = {1}", firstNum, secondNum));
        System.out.println(MessageFormat.format("After swapping a = {0}, b = {1}", firstNum, secondNum));
    }
}
