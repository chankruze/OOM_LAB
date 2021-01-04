package in.geekofia;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Pr18 {
    /**
     * Practical Number: 18
     * Task: Write a java program to read a file line by line and print the line on the output screen.
     */
    public static void main(String[] args) {
        try {
            Path path = Paths.get("assets/file_01.txt");
            Scanner scanner = new Scanner(path);

            //read line by line
            while (scanner.hasNextLine()) {
                //process each line
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("The file not found ;(\n\n---- Stack Trace ----");
            e.printStackTrace();
        }
    }
}
