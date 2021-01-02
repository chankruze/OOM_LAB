package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr08 {
    /**
     * Practical Number: 08
     * Task: Write a Java program and compute the sum of the digits of an integer.
     */
    public static void main(String[] args) {
        // init variables
        int num, numShadow, sum = 0;

        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        System.out.print("Enter the number (Integer): ");
        num = usrIn.nextInt();
        numShadow = num;

        // calculate the sum of digits
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        // show the result
        System.out.println("\n---RESULT---");
        System.out.println(MessageFormat.format("Sum of the digits of {0} is {1}", numShadow, sum));
    }
}
