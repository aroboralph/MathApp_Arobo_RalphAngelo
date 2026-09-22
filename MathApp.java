/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
 
        do {
            System.out.println("\n=== Math App Menu ===");
            System.out.println("1.  Addition of two numbers");
            System.out.println("2.  Subtraction of two numbers");
            System.out.println("3.  Multiplication of two numbers");
            System.out.println("4.  Division of two numbers");
            System.out.println("5.  Factorial of a number");
            System.out.println("6.  Power (x^y)");
            System.out.println("7.  Sum of numbers 1 to N");
            System.out.println("8.  Check if a number is prime");
            System.out.println("9.  Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers (stored in an array)");
            System.out.println("12. Maximum of N numbers (stored in an array)");
            System.out.println("0.  Exit");
            System.out.print("Enter your choice: ");

            // Handles non-numeric menu input
            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); 
                choice = -1;
                continue;
            }

            choice = input.nextInt();

            switch (choice) {
                case 1: { // Addition
                    System.out.print("Enter first number: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                }
                case 2: { // Subtraction
                    System.out.print("Enter first number: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                }
                case 3: { // Multiplication
                    System.out.print("Enter first number: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                }
                case 4: { // Division
                    System.out.print("Enter numerator: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter denominator: ");
                    double num2 = input.nextDouble();
                    
                    // Edge Case: Divide-by-zero
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                }
                case 5: { // Factorial
                    System.out.print("Enter an integer: ");
                    int n = input.nextInt();

                    // Edge Case: Negative Factorial
                    if (n < 0) {
                        System.out.println("Error: Factorial of a negative number is undefined.");
                    } else {
                        long fact = 1;
                        for (int i = 1; i <= n; i++) {
                            fact *= i;
                        }
                        System.out.println("Result: " + n + "! = " + fact);
                    }
                    break;
                }
                case 6: { // Power
                    System.out.print("Enter base (x): ");
                    double x = input.nextDouble();
                    System.out.print("Enter exponent (y): ");
                    double y = input.nextDouble();
                    System.out.println("Result: " + Math.pow(x, y));
                    break;
                }
                case 7: { // Sum of numbers 1 to N
                    System.out.print("Enter N: ");
                    int n = input.nextInt();
                    
                    if (n < 1) {
                        System.out.println("Error: N must be 1 or greater.");
                    } else {
                        long sum = 0;
                        for (int i = 1; i <= n; i++) {
                            sum += i;
                        }
                        System.out.println("Sum from 1 to " + n + " = " + sum);
                    }
                    break;
                }
                case 8: { // Prime check
                    System.out.print("Enter an integer: ");
                    int num = input.nextInt();
                    boolean isPrime = true;

                    if (num <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(num); i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println(num + " is a prime number.");
                    } else {
                        System.out.println(num + " is NOT a prime number.");
                    }
                    break;
                }
                case 9: { // GCD
                    System.out.print("Enter first integer: ");
                    int a = Math.abs(input.nextInt());
                    System.out.print("Enter second integer: ");
                    int b = Math.abs(input.nextInt());
                    
                    int x = a, y = b;
                    while (y != 0) {
                        int temp = y;
                        y = x % y;
                        x = temp;
                    }
                    System.out.println("GCD of " + a + " and " + b + " is: " + x);
                    break;
                }
                case 10: { // Absolute Value
                    System.out.print("Enter a number: ");
                    double num = input.nextDouble();
                    System.out.println("Result: " + Math.abs(num));
                    break;
                }
                case 11: { // Average of N numbers using array
                    System.out.print("Enter the number of elements (N): ");
                    int n = input.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: Array size must be greater than 0.");
                    } else {
                        double[] numbers = new double[n];
                        double sum = 0;
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter value " + (i + 1) + ": ");
                            numbers[i] = input.nextDouble();
                            sum += numbers[i];
                        }
                        System.out.println("Average: " + (sum / n));
                    }
                    break;
                }
                case 12: { // Maximum of N numbers using array
                    System.out.print("Enter the number of elements (N): ");
                    int n = input.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: Array size must be greater than 0.");
                    } else {
                        double[] numbers = new double[n];
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter value " + (i + 1) + ": ");
                            numbers[i] = input.nextDouble();
                        }

                        double max = numbers[0];
                        for (int i = 1; i < n; i++) {
                            if (numbers[i] > max) {
                                max = numbers[i];
                            }
                        }
                        System.out.println("Maximum value: " + max);
                    }
                    break;
                }
                case 0:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 0);

        input.close();
    }
}
