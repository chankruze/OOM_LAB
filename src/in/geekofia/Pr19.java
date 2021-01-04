package in.geekofia;

import java.io.*;
import java.text.MessageFormat;

public class Pr19 {
    /**
     * Practical Number: 19
     * Task: Write a java program to read content from one file and write it into another file.
     */
    public static void main(String[] args) {
        try {
            String inFileName = "assets/file_01.txt", outFileName = "assets/written_file.txt";
            File inFile = new File(inFileName), outFile = new File(outFileName);
            String line;

            // reader buffer
            FileInputStream fileInputStream = new FileInputStream(inFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); // (fis, cs = default)
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // writer buffer
            FileWriter writer = new FileWriter(outFile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            while((line = bufferedReader.readLine()) != null){
                // write the line to the file
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            // close buffer reader and writer
            bufferedWriter.close();
            bufferedReader.close();

            System.out.println(MessageFormat.format("{0}\nis successfully written to\n{1}", inFile.getAbsolutePath(), outFile.getAbsolutePath()));
        } catch (IOException e) {
            System.out.println("The file not found ;(\n\n---- Stack Trace ----");
            e.printStackTrace();
        }
    }
}
