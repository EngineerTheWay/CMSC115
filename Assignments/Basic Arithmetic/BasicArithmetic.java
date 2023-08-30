// Name: Way, Caleb      CMIS141/7385     Date: 03/13/2023
// Assignment Two

import java.util.Scanner; // Imports the "Scanner" class.

public class WayAssignmentTwo { // Declares the WayAssignmentTwo class

    /*
     * Assignment Two
     * 
     * Objective:
     * 
     * 1.  Prompts a user to enter two numbers between 200 and 1000 and a symbol for operation 
     *     such as ‘+’, ‘-‘, ‘*’, and ‘/’ (use Scanner for input).
     * 
     * 2.  Code uses nested if statement or switch to perform the operation on the two numbers.
     * 
     * 3.  If the provided symbol is valid, displays the input data along with the result of the 
     *     calculationto the console. Otherwise displays an error message
     */

     public static void main(String[] args) { 

        Scanner math = new Scanner(System.in); // Creates the scanner used for input

        // Welcome message and instructions for the user
        System.out.println("Let's do some simple calculations on a few numbers."); 
        System.out.println("Enter two whole numbers between 200 and 1000, as well as a calculation operator ('+', '-', '*', or '/'), all seperated by a space."); 

        // Declares the variables
        int num1 = math.nextInt();
        int num2 = math.nextInt();
        char operator = math.next().charAt(0);
        int result;

        if ((num1 >= 200 && num1 <= 1000) && (num2 >= 200 && num2 <= 1000)) { 
            /*
             * Checks if the numbers are in the expected input range. If so, it is uses the following nested switch 
             * to calculate based on the operator the user chose. 
             * 
             * If the operator is invalid, it responds with an error message and instructs the user to try again with 
             * a valid operator.
             */
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result); 
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result); 
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result); 
                    break;

                case '/':
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result); 
                    break;

                default:
                    System.out.println("Your operator was invalid. Try again with a valid operator.");
                    break;
            }
        } else {
            /*
             * Else statement to respond to the user if their numbers were outside the expected input range.
             * 
             * Also informs the user if their chosen operator was valid or not.
             * 
             * If both are invalid, a message informing the user is displayed.
             */
            switch (operator) {
                case '+':
                    System.out.println("Your operator was valid, but one or both of your numbers was outside the parameters. Make sure your numbers are between 200 and 1000.");
                    break;

                case '-':
                    System.out.println("Your operator was valid, but one or both of your numbers was outside the parameters. Make sure your numbers are between 200 and 1000.");
                    break;

                case '*':
                    System.out.println("Your operator was valid, but one or both of your numbers was outside the parameters. Make sure your numbers are between 200 and 1000.");
                    break;

                case '/':
                    System.out.println("Your operator was valid, but one or both of your numbers was outside the parameters. Make sure your numbers are between 200 and 1000."); 
                    break;

                default:
                    System.out.println("Your operator was invalid and one or both of your numbers was outside the parameters. Make sure your numbers are between 200 and 1000 and choose a valid operator.");
                    break;
            }
        }
        
        math.close(); // Closes the scanner "scan"
  }       
}
