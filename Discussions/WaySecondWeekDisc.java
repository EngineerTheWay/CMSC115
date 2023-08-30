// Name: Way, Caleb      CMIS141/7385     Date: 03/09/2023
// Second Week Discussion

import java.util.Scanner; // Imports the "Scanner" class.

public class WaySecondWeekDisc {  // Declares the WaySecondWeekDisc class 

    /*
     * Excercise for the second week discussion.
     * 
     * Calculate Farenheit and Celcius into Kelvin.
     */

        public static void main(String[] args) { // Declares the main method

            Scanner scan = new Scanner(System.in); // Declares a Scanner variable named "scan" and creates a Scanner that reads input from System.in

            System.out.println("Let's convert two temperatures into Kelvin."); // Displays a message to the console about the purpose of the program.
            System.out.println("First, enter a temperature in Farenheit:"); // Displays instructions to the console for the following input.
            int temp1 = scan.nextInt(); // Declares an int varible named "temp1" and assigns it the value the user to inputs to the console.

            System.out.println("Next, enter a temperature in Celcius:"); // Displays instructions to the console for the following input.
            int temp2 = scan.nextInt(); // Declares an int varible named "temp2" and assigns it the value the user to inputs to the console.

            System.out.println(temp1 + " degrees Farenheit is " + ((temp1 - 32) * 5/9 + 273.15) + " degrees Kelvin."); // Output; converts the value of "temp1" to Kelvin and displays it to the console.
            System.out.println(temp2 + " degrees Celcius is " + (temp2 + 273.15) + " degrees Kelvin."); // Output; converts the value of "temp2" to Kelvin and displays it to the console.

            scan.close(); // Closes the scanner "scan"
      }       
  }
  