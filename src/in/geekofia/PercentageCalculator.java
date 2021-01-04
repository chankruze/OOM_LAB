package in.geekofia;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Scanner;

public class PercentageCalculator {
    private boolean _continue = true;
    private Scanner userIn = null;

    public PercentageCalculator() {
        userIn = new Scanner(System.in);
    }

    // calculate x % of given y
    private double calcXPercentageOfY(double x, double y) {
        return y * (x / 100);
    }

    // calculate what % of y is x
    private double calcWhatPercentageOfYisX(double x, double y) {
        return x / y * 100;
    }

    public void run() {
        while (_continue) {
            // ask to choose which conversion to use
            System.out.println("\n\t<<< Percentage Calculator >>>\n");
            System.out.println("Following conversions are supported:\n");
            System.out.println("\t1. calculate x % of y");
            System.out.println("\t2. calculate what % of y is x");
            System.out.print("\nChoose which conversion to use [1/2]: ");

            char _option = userIn.next().charAt(0);
            double x;
            double y;

            switch (_option) {
                case '1' -> {
                    System.out.println("\n--- Calculating X % of Y ---");
                    System.out.print("Enter a value of x: ");
                    x = userIn.nextDouble();
                    System.out.print("Enter a value of y: ");
                    y = userIn.nextDouble();

                    System.out.println(MessageFormat.format("\n{0}% of {1} is {2}", x, y, calcXPercentageOfY(x, y)));
                }
                case '2' -> {
                    System.out.println("\n--- Calculating what % of Y is X ---");
                    System.out.print("Enter a value of x: ");
                    x = userIn.nextDouble();
                    System.out.print("Enter a value of y: ");
                    y = userIn.nextDouble();

                    System.out.println(MessageFormat.format("\n{0} is {1}% of {2}", x, calcWhatPercentageOfYisX(x, y), y));
                }
            }

            // loop termination logic
            System.out.print("\nWant to calculate more ? (y/N): ");

            if (Character.toLowerCase(userIn.next().charAt(0)) != 'y')
                _continue = false;
        }
    }
}
