package in.geekofia;

import java.text.MessageFormat;
import java.util.Scanner;

public class TemperatureConvertor {
    private boolean _continue = true;
    private Scanner userIn = null;

    public TemperatureConvertor() {
        userIn = new Scanner(System.in);
    }

    private double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.00 / 9.00);
    }

    private double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * (9.00 / 5.00)) + 32;
    }

    public void run() {
        while (_continue) {
            // ask to choose which conversion to use
            System.out.println("\n\t<<< Temperature Convertor >>>\n");
            System.out.println("Following conversions are supported:\n");
            System.out.println("\t1. celsius (°C) to fahrenheit (°F)");
            System.out.println("\t2. fahrenheit (°F) to celsius (°C)");
            System.out.print("\nChoose which conversion to use [1/2]: ");

            char _option = userIn.next().charAt(0);
            double x;

            switch (_option) {
                case '1' -> {
                    System.out.println("\n--- celsius (°C) to fahrenheit (°F) ---");
                    System.out.print("Enter the temperature in celsius (°C): ");
                    x = userIn.nextDouble();
                    System.out.println(MessageFormat.format("\n{0}°C = {1}°F", x, convertCelsiusToFahrenheit(x)));
                }
                case '2' -> {
                    System.out.println("\n--- fahrenheit (°F) to celsius (°C) ---");
                    System.out.print("Enter the temperature in fahrenheit (°F): ");
                    x = userIn.nextDouble();
                    System.out.println(MessageFormat.format("\n{0}°F = {1}°C", x, convertFahrenheitToCelsius(x)));
                }
            }

            // loop termination logic
            System.out.print("\nWant to calculate more ? (y/N): ");

            if (Character.toLowerCase(userIn.next().charAt(0)) != 'y')
                _continue = false;
        }
    }
}
