import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
            \n-------------------------------------
            ----- Welcome to the Calculator -----
            -------------------------------------
            """);

        while (true) {
            System.out.println("""
            \nEnter "c" to continue with the Calculator
            Type "exit" if you want to quit the Calculator
            """);
            System.out.print("Enter your Choice: ");
            String choice = scanner.next().toLowerCase();

            if (choice.equals("exit")) {
                System.out.println("Exiting Calculator!!");
                break;
            } else if (choice.equals("c")) {
                System.out.println("Continuing...\n");
                operator(scanner);
            } else {
                System.out.println("Invalid Input! Try Again");
            }
        }
        scanner.close();
    }

    public static void operator(Scanner scanner){
        String[] operators = {"+","-","*","/"};

        //Asking the user to choose an operator
        System.out.println("""
                Choose an Operator to do the desired operation:
                Available Operators: "+" | "-" | "*" | "/"
                """);

        System.out.print("Enter Operator: ");
        String operator = scanner.next();

        boolean isValidOperator = false;
        for (String op : operators){
            if (op.equals(operator)){
                isValidOperator = true;
                break; //Breaking the loop if operator is valid
            }
        }
        if (!isValidOperator){
            System.out.println("Ïnvalid Operator!! Please choose from the available operators");
        }

        performOperation(scanner, operator);

    }

    public static double getValidNumber(Scanner scanner, String prompt){
        double num = 0;
        boolean validInput = false;

        while (!validInput){
            System.out.println(prompt);
            if (scanner.hasNextDouble()){
                num = scanner.nextDouble();
                validInput = true;
            }else{
                System.out.println("Ïnvalid Input! Please enter a valid number.");
                scanner.next();
            }
        }
        return num;
    }

    public static void performOperation(Scanner scanner, String operator){
        double num1 = getValidNumber(scanner, "\nEnter First Number: ");
        double num2 = getValidNumber(scanner, "\nEnter Second Number: ");

        double result;
        switch (operator){
            case "+":
                result = num1 + num2;
                System.out.println("Result is: " + result);
                break;
            //Rest of the operations
        }

    }


}


