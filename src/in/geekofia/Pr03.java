package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr03 {
    /**
     * Practical Number: 03
     * Task: Write a Java program that takes a number as input and prints its multiplication table upto 10.
     */
    public static void main(String[] args) {
        // init variables
        Double num;
        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        // save the number
        num = usrIn.nextDouble();

        // show the result
        System.out.println("---RESULT---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(MessageFormat.format("{0} x {1} = {2}", num, i, (num * i)));
        }
    }
}
