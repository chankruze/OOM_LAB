package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr11 {
    /**
     * Practical Number: 11
     * Task: Write a Java program to accept a number and check the number is even or not.
     * Prints 1 if the number is even or 0 if the number is odd.
     */
    public static void main(String[] args) {
        // init variables
        int num;
        char option;

        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        System.out.print("Enter the a number (integer): ");
        // store the num
        num = usrIn.nextInt();

        if (num % 2 == 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
