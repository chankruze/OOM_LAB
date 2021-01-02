package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr09 {
    /**
     * Practical Number: 08
     * Task: Write a Java program and compute the sum of the digits of an integer.
     */
    public static void main(String[] args) {
        // init variables
        int letterCount = 0, spaceCount = 0, numCount = 0, otherCount = 0;
        String str;

        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        // store string
        str = usrIn.nextLine();
        // convert string to char array
        char[] charArray = str.toCharArray();

        // iterate the char array and check for the char match with letter/space/number or others
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(charArray[i])) {
                letterCount++;
            } else if (Character.isSpaceChar(charArray[i])) {
                spaceCount++;
            } else if (Character.isDigit(charArray[i])) {
                numCount++;
            } else {
                otherCount++;
            }
        }

        // show the result
        System.out.println("\n---RESULT---");
        System.out.println(MessageFormat.format("{0}\nAbove string contains {1} letters, {2} spaces, {3} numbers and {4} other characters", str, letterCount, spaceCount, numCount, otherCount));
    }
}
