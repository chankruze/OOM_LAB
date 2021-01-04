package in.geekofia;

import java.util.Scanner;

public class Pr12 {
    /**
     * Practical Number: 12
     * Task: Write a Java program that accepts two integer values from the user and return the larger values.
     * However if the two values are the same, return 0 and return the smaller value if the two values have
     * the same remainder when divided by 6.
     */
    private static int checkNum(int a, int b) {
        // if the two values are the same, return 0
        if (a - b == 0) {
            return 0;
        } else {
            // return the smaller value if the two values have
            // the same remainder when divided by 6
            if (a % 6 == b % 6)
                return Math.min(a, b);

            // return the larger values
            return Math.max(a, b);
        }
    }

    public static void main(String[] args) {
        // init variables
        int numOne, numTwo;
        char option;

        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        // ask user input
        System.out.print("Enter a number (integer): ");
        numOne = usrIn.nextInt();
        System.out.print("Enter another number (integer): ");
        numTwo = usrIn.nextInt();

        System.out.println(checkNum(numOne, numTwo));
    }
}
