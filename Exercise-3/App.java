import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //A mess of variables
        String lineContent = "";
        String name = "";
        int sum = 0;
        double value = 0.0;
        String[] disconnected = null;
        String regex = "[\\s]";

        //reading
        try (Scanner scanner = new Scanner(new File("Exercise-3/students.txt"))) { 
            //writing
            try (PrintWriter writer = new PrintWriter("Exercise-3/grades_report.txt")) {
                while(scanner.hasNextLine()){
                    lineContent = scanner.nextLine();
                    try {
                        sum = 0;
                        disconnected = lineContent.split(regex);
                        name = "[" + disconnected[0] + "]"; 
                        sum += Integer.parseInt(disconnected[1]);
                        sum += Integer.parseInt(disconnected[2]);
                        sum += Integer.parseInt(disconnected[3]);
                        value = sum / 3.0;
                        writer.println(String.format("Student: %-18s | Average: [%.2f].", name, value));
                    } catch (NumberFormatException e) {
                        System.out.println("There's an error in the grades");
                    }
                    
                }

            } catch (IOException e) {
                System.out.println("We cannot make this file, could be an invalid location");
            }
              
        } catch (FileNotFoundException e) {
            System.out.println("That file doesn't exist or it's not in the correct folder");
        } finally {
            System.out.println("Processing Complete");
        }



    }
    
}
