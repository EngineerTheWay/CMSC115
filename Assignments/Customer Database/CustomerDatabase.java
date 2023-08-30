// Name: Way, Caleb      CMIS141/7385     

    /*
     * Final Project - CMIS141
     * 
     * Objective - Write a Java program that displays a menu to allow the user the following functionality:
     * 
     * 1. Add multiple new customers - prompt user for the number of customers to be loaded and then 
     *    prompts for each customer's name, customer id (5-digit number), and total sales
     * 
     * 2. Add single new customer - prompts the user for customer data: 
     *   customername, customer id, and total sales
     * 
     * 3. Display all customers - displays each customer's data to the console, one customer per line
     * 
     * 4. Retrieve specific customer's data - prompts the user for the customer id and displays the 
     *    corresponding customer's data: customer id, customer name, and total sales
     * 
     * 5. Retrieve customers with total sales based on the range - prompts the user for the lowest and 
     *    highest total sales and displays all customers with total sales in that range. Display each 
     *    customer on a separate line with all information – Customer Name, Customer ID, and Total Sales
     * 
     * 6. Exit - Exit Program
     * 
     */

import java.util.Scanner;

// Class used to construct customer data objects
class Customer {

    // Customer Class Variables
    private String name;
    private int id;
    private double sale;

    // Constructor for Customer Object
    public Customer(String name, int id, double sale) {
        this.name = name;
        this.id = id;
        this.sale = sale;
    }

    // Returns name variable
    public String getName() {
        return name;
    }

    // Returns id variable
    public int getID() {
        return id;
    }

    //Returns sale variable
    public double getSale() {
        return sale;
    }

    // Parses string for customer
    public String toString() {
        return "Name: " + getName() + " Customer ID: " + getID() + " Total Sales: $" + getSale();
    }

}

//Class used to create and modify Custumers array object
class Customers {

    int DATA_SIZE = 100; // CONSTANT variable that sets the maxiumum size of the Customers array
    int data_allocated = 0; // Ticker for keeping track of how many customers have been allocated to the customers array
    private Customer[] customers = new Customer[DATA_SIZE]; // Creates an array using the DATA_SIZE variable for parameters

    // Method to create new customer object in customers array using Customer constructor
    public void addCustomer(String name, int id, double sale) {
        int i = findFreeIndex(); // Calls the findFreeIndex method and sets i to the next null variable in the customers array
            customers[i] = new Customer(name, id, sale); // Calls Customer constructor; creates new customer object
            data_allocated++; // increase ticker
    }

    // Method to verify users requested input would not exceed array bounds
    public int checkCustomerMemAvail(int input) {
        if(data_allocated + input <= DATA_SIZE) {
            return input; // If does not exeed, return user input value
        } else { // The value would exceed memory for array and throw an exception, instead return a message to console
            System.out.println("This action would exceed maximum allocated memory for array. Execution aborted.");
            return input = -1; // If exeeds, returns -1 (to be used later)
        }

    }
    
    // Finds the next null value in array, returns value of i
    private int findFreeIndex() { 
        int i;
        for (i = 0; i < DATA_SIZE; i++) {                                           
            if(customers[i] == null) { 
                break; // breaks when next null is found
            }
        }
        return i;
    }

    // Checks for customers with values of sales within array see if any fall within a users range parameters; does not print null values in array.
    public String rangeToString(int low, int high) {

        // If statement checks if data has been imported yet, if not return message to console. If yes, display customer data within parameters.
        if (data_allocated > 0) { 
            for(int i = 0 ; i < DATA_SIZE ; i++){ 
                if((customers[i] != null) && (customers[i].getSale() >= low) && (customers[i].getSale() <= high)){ 
                    System.out.println(customers[i]);
                }
            }
        } else { // displays if no data has been imported
            System.out.println("No customer data has been imported yet!");
        }
        return null;
    
    }

    // Looks for specific USERID within the array, if found display value to console; does not print null values in array.
    public String singToString(int input) {
    
        if (data_allocated > 0) { // If statement checks if data has been imported yet, if not return message to console. If yes, display customer USERID equal to input parameters.
            for(int i = 0 ; i < DATA_SIZE ; i++) { 
                if((customers[i] != null) && (customers[i].getID() == input)) { 
                    System.out.println(customers[i]);
                }
            }
        } else { // displays if no data has been imported
            System.out.println("No customer data has been imported yet!");
        }
        return null;
    
    }
    
    // Displays ALL imported customer data to the console; does not print null values in array.
    public String toString() {
    
        if (data_allocated > 0) { // If statement checks if data has been imported yet, if not return message to console. If yes, return ALL customer data..
            for(int i = 0 ; i < DATA_SIZE ; i++){
                if(customers[i] != null) {
                    System.out.println(customers[i]);
                }
            }
        } else { // displays if no data has been imported
            System.out.println("No customer data has been imported yet!");
        }
        return null;
    
    }
}

// Main class used to execeute program
public class CustomerDatabase{
    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in); // Opens Scanner

        System.out.println("Customer Order Database"); 

        Customers cust = new Customers(); // Creates an Array Object using the Customers class
        
        // User Menu - loops until user selects Menu Option 9, thus setting var programRun to 0
        int programRun = 1;
        do {
            System.out.println("\n*** MENU ***");
            System.out.println("1: Add multiple new customers");
            System.out.println("2: Add a single new customer");
            System.out.println("3: Display all customer data");
            System.out.println("4: Retrieve a single customer's data");
            System.out.println("5: Retrieve all customers data within range");
            System.out.println("9: Exit Program\n");

            //User Menu Selection
            System.out.print("Enter a number to select from the menu options above: ");
            int menuSelect = scan.nextInt();

            if(menuSelect == 1) { // Menu Selection for adding multiple customers
                System.out.print("\nHow many customers would you like to add? ");
                int userInput = scan.nextInt();
                int checkArray = cust.checkCustomerMemAvail(userInput); // method to check if the number of customers user wants to add exeeds bounds of array; returns value -1 if exceeds, returns user input if not

                if (checkArray != -1) { // If number of added users doesnt exceed array, create X number of users
                    for(int i = 0; i < checkArray; i++){ // Same var used to check array for bounds is used to create users

                        System.out.print("\nCustomer Name: ");
                        String name = scan.next();
                
                        System.out.print("Customer ID: ");
                        int id = scan.nextInt();

                        System.out.print("Customer Sales: $");
                        double sale = scan.nextDouble();

                        cust.addCustomer(name, id, sale);

                    }

                }

            } else if (menuSelect == 2) { // menu selection for adding single customer

                int checkArray = cust.checkCustomerMemAvail(1); // method to check if adding one customer exceeds bounds of array; returns value -1 if exceeds, returns 1 if not
                if (checkArray != -1) { // If adding a user doesnt exeed the array, create a new user
                    System.out.print("\nCustomer Name: ");
                    String name = scan.next();
                
                    System.out.print("Customer ID: ");
                    int id = scan.nextInt();

                    System.out.print("Customer Sales: $");
                    double sale = scan.nextDouble();

                    cust.addCustomer(name, id, sale);
                }

            } else if (menuSelect == 3) { // Menu Selection to display all customer data
                cust.toString();

            } else if (menuSelect == 4) { // Menu Selection to find specific User ID
                System.out.print("\nCustomer ID: ");
                int custID = scan.nextInt();

                cust.singToString(custID);

            } else if (menuSelect == 5) { // Menu Selection for Sales Range
                System.out.print("\nEnter a low and high range seperated by a space: ");
                int rangeLow = scan.nextInt();
                int rangeHigh = scan.nextInt();

                cust.rangeToString(rangeLow, rangeHigh);


            } else if (menuSelect == 9) { // Menu Selection to Exit Program; exits do-while loop.
                System.out.println("\nExitting program.");
                programRun = 0;

            } else { // Prints if the user inputs an invalid menu selection; loops menu.
                System.out.println("Invalid selection. Please try again.\n");
            }
            
        } while (programRun == 1);

    scan.close(); 
    }
}
