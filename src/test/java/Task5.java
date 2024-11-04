import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50}; // Example array
        int index;

        try {
            System.out.print("Enter an index to access in the array: ");
            index = scanner.nextInt();


            System.out.println("Array element at index " + index + ": " + array[index]);

            System.out.print("Enter an integer to divide a fixed number (100) by: ");
            int divisor = scanner.nextInt();


            int result = 100 / divisor;
            System.out.println("Result of division: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}

