// Name: Way, Caleb      CMIS141/7385     Date: 4/15/2023
// Fifth Week Discussion

import java.util.Scanner;

public class WayFifthWeekDisc {

    /*
     * Excercise for the fifth week discussion.
     * 
     * Creates a square based off the input of the user using a For loop; checks users inputs are within parameters.
     * 
     */

        public static void main(String[] args) { 

            Scanner scan = new Scanner(System.in); 

            System.out.println("Welcome to Rectange Generator v1.0"); 
            System.out.print("Enter two integers between 1-20 for height and width seperated by a space: "); 
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            int column, row;
            System.out.println(); 

            if ((rows >= 1) && (columns >= 1) && (rows < 21) && (columns < 21)) { // Verifies the users input is within expect parameters.
                for(row = 1; row <= rows;row++) {
                    for (column = 1; column <= columns;column++) {
                        if ((column == 1) || (column == columns) || (row == 1) || (row == rows)) { // Checks for perimeter
                            System.out.print("X "); // Prints perimeter items
                        } else {
                            System.out.print("  "); // Prints within the perimeter
                        }
                    }
                System.out.println();
                }

                
            } else {
                System.out.println("Please enter integers between 1 and 20.");
            }
                
            scan.close(); // Closes the scanner "scan"
        }
}
  