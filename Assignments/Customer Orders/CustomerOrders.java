// Name: Way, Caleb      CMIS141/7385     Date: 03/09/2023
// Assignment One

import java.util.Scanner; 

public class CustomerOrders { 

    /*
     * Assignment One
     * 
     * Objective:
     * 
     * 1. Prompts a user to enter a customer id, the unit price in this format (e.g. 3.75), quantity (as a whole number),
     *    product description, and discount in this format (e.g., .10) (use Scanner for input).
     * 
     * 2. Calculates the customer's overall order total before and after the discount.
     * 
     * 3. Displays the input data along with the order total before and after the discount to the console.
     * 
     */

    public static void main(String[] args) { // Declares the main method

        Scanner sc = new Scanner(System.in); // Declares a Scanner variable named "sc" and creates a Scanner that reads input from System.in

        System.out.println("Enter customer order details. Please follow each prompt's instructions."); // Displays a message to the console about the purpose of the program.

        System.out.println("Customer ID #:"); // Displays instructions to the console for the following input.
        int custID = sc.nextInt(); // Declares an int varible named "custID" and assigns it the value the user to inputs to the console.

        System.out.println("Unit Price: (e.g. 0.00)"); // Displays instructions to the console for the following input.
        double unitPrice = sc.nextDouble(); // Declares an int varible named "unitPrice" and assigns it the value the user to inputs to the console.

        System.out.println("Quanity: (Whole Number, Numerical)"); // Displays instructions to the console for the following input.
        int quantity = sc.nextInt(); // Declares an int varible named "quantity" and assigns it the value the user to inputs to the console.
        sc.nextLine(); // Consumes the \n created by nextInt (without this it was skipping the input for the string.)

        System.out.println("Product Descripition:"); // Displays instructions to the console for the following input.
        String prodDesc = sc.nextLine(); // Declares an int varible named "prodDesc" and assigns it the value the user to inputs to the console.

        System.out.println("Discount: (e.g. .15)"); // Displays instructions to the console for the following input.
        double discount = sc.nextDouble(); // Declares an int varible named "discount" and assigns it the value the user to inputs to the console.

        // Output; displays the data inputted by the user to the console
        System.out.println("**** CUSTOMER ORDER DATA ****");
        System.out.println("Customer ID: " + custID);
        System.out.println("Product Description: " + prodDesc);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("...");


        // Output; displays the total before and after discount
        System.out.println("Order SUBTOTAL (before discount): $" + (unitPrice * quantity));
        System.out.println("Order TOTAL (after discount): $" + ((unitPrice * quantity) - (unitPrice * quantity) * discount));
        System.out.println("*****************************");

        sc.close(); // Closes the scanner "scan"
    }
}
