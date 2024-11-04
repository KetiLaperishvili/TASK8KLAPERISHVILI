import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner fileScanner = null;

        try {
            File file = new File("data.txt");
            fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure data.txt exists in the directory.");
        } finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
    }
}

