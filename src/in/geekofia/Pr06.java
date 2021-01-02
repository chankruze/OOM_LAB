package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr06 {
    /**
     * Practical Number: 06
     * Task: Write a Java program to convert a decimal number to binary number.
     */
    public static void main(String[] args) {
        // init variables
        int num, numShadow;
        char option;

        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        // ask user to input the number
        System.out.print("Enter an integer number: ");
        num = usrIn.nextInt();

        // ask user to choose conversion method
        System.out.println("Which logic do you want to use ?");
        System.out.println("1. inbuilt Inter.toBinaryString()");
        System.out.println("2. own math logic)");
        System.out.print("Choose any one of them by entering [1/2]: ");
        option = usrIn.next().charAt(0);

        if (option == '1') {
            String bin = new StringBuilder(Integer.toBinaryString(num)).reverse().toString();
            // show the result
            System.out.println("\n---RESULT---");
            System.out.println(MessageFormat.format("{0} is {1} in binary", num, bin));
        } else {
            numShadow = num;
            int i = 0;
            String bin = "";

            while (num > 0) {
                bin += num % 2;
                num /= 2;
            }

            // show the result
            System.out.println("\n---RESULT---");
            System.out.println(MessageFormat.format("{0} is {1} in binary", numShadow, bin));
        }
    }
}
