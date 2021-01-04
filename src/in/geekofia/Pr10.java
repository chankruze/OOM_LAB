package in.geekofia;

import java.util.Scanner;

public class Pr10 {
    /**
     * Practical Number: 10
     * Task: Write a Java program and compute the sum of the digits of an integer.
     */
    public static void main(String[] args) {
        // init variables
        String str;
        char option;

        // creates an instance of Scanner
        Scanner usrIn = new Scanner(System.in);

        // store string
        str = usrIn.nextLine();

        // ask user to choose conversion method
        System.out.println("Which logic do you want to use ?");
        System.out.println("1. StringBuilder.reverse()");
        System.out.println("2. own logic");
        System.out.print("Choose any one of them by entering [1/2]: ");
        option = usrIn.next().charAt(0);

        while (option != '1' || option != '2') {
            if (option == '1') {
                System.out.println(new StringBuilder(str).reverse());
                return;
            } else if (option == '2') {
                char[] charArray = str.toCharArray();

                for (int i = charArray.length - 1; i >= 0; i--) {
                    System.out.print(charArray[i]);
                }

                System.out.println("");
                return;
            }

            System.out.print("Invalid option. Choose any one of them by entering [1/2]: ");
            option = usrIn.next().charAt(0);
        }
    }
}
