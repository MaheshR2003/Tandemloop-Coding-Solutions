package com.tandemloop;
import java.util.Scanner;

public class Calculator {
	    
	    double a;
	    double b;
	    String operation;

	    // Constructor
	    Calculator(double a, double b, String operation) {
	        this.a = a;
	        this.b = b;
	        this.operation = operation;
	    }

	    // Method to perform the operation
	    public void calculate() {
	        switch (operation.toLowerCase()) {
	            case "add":
	                System.out.println("Result: " + (a + b)); // Add Operation
	                break;
	            case "subtract":
	                System.out.println("Result: " + (a - b)); // Subtract Operation
	                break;
	            case "multiply":
	                System.out.println("Result: " + (a * b)); // Multiply Operation
	                break;
	            case "divide":
	                if (b != 0) {
	                    System.out.println("Result: " + (a / b)); // Divide Operation
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Invalid operation. Please use add, subtract, multiply or divide.");
	        }
	    }
	}


public class CalcApp {
	public static void main(String[] args) {  // main method
	
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number a = ");
    double a = sc.nextDouble();

    System.out.print("Enter the number b = ");
    double b = sc.nextDouble();

    sc.nextLine(); 
    System.out.print("Enter operation (add / subtract / multiply / divide): ");
    String operation = sc.nextLine();

    // Create Calculator object and perform calculation
    Calculator calc = new Calculator(a, b, operation);
    calc.calculate();

    sc.close();
  }
}


