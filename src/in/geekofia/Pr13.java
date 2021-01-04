package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr13 {
    /**
     * Practical Number: 13
     * Task: Write a Java program to get the larger value between first and last element of an array (length 3) of integers.
     */
    public static void main(String[] args) {
        // init variables
        int[] numArray = new int[3]; // length 3

        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        // store integers to array
        System.out.println("Enter 3 integers: ");
        for (int i = 0; i < numArray.length; ++i) {
            numArray[i] = usrIn.nextInt();
        }

        int max = numArray[0];
        // traverse the array to find the max
        for (int j : numArray) {
            max = Math.max(j, max);
        }

        System.out.println(MessageFormat.format("Largest value in the array is {0}", max));
    }
}
