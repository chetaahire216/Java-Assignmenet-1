import java.util.Scanner;  // Import Scanner for user input

class Input2_number_of_sum {  // Class name

    public static void main(String args[]) {  // Main method
        Scanner s1 = new Scanner(System.in);  // Scanner object for input
        System.out.println("Enter any two numbers for sum");  // Prompt message
        int number1 = s1.nextInt();  // Read first integer
        int number2 = s1.nextInt();  // Read second integer
        System.out.println("Sum is: " + (number1 + number2));  // Print sum
    }
}
