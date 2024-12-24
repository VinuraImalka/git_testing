import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator!");
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Select the operation:");
        System.out.println("1. Subtraction");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double result = subtract(num1, num2);
            System.out.println("The result of subtraction is: " + result);
        } else {
            System.out.println("Invalid choice. Please restart the program.");
        }

        scanner.close();
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    }
}


