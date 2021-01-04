package in.geekofia;

import in.geekofia.utils.NoMatchException;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pr20 {
    /**
     * Practical Number: 20
     * Task: Define an exception called “No Match Exception” that is thrown when a string is not equal to “India”.
     * Write a program that uses this exception.
     */
    public static void main(String[] args) throws NoMatchException {
        // init scanner
        Scanner usrIn = new Scanner(System.in);

        // ask user to enter a string
        System.out.print("Enter a country name (string): ");
        String country = usrIn.nextLine();

        if (!country.toLowerCase().equals("india"))
            throw new NoMatchException(MessageFormat.format("entered country `{0}` is not India", country));
        else
            System.out.println("Jay Hind!");
    }
}
