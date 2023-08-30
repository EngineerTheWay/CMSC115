// Name: Way, Caleb      CMIS141/7385     Date: 04/16/2023
// Assignment Four

import java.util.Scanner; 

public class WayAssignmentFour { 

    /*
     * Assignment Four
     * 
     * Objective:
     * 
     * 1. Write Java code to prompt the user for the number of rows (e.g.7) and output the right-side triangle 
     *    pattern below using nested for-loops.
     * 
     * 2. Write Java code to prompt the user for the starting number to print (e.g.5) and output the rectangular 
     *    pattern below using nested for-loops.

     * 
     */

    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in); 

        // PART I
        System.out.println("Provide the length of the bases of a right triangle"); 
        System.out.print("Enter an integer: "); 
        int rows = scan.nextInt();
        int row, column; // Declares variables

        System.out.println(); 

        for (row = 1; row <= rows; row++) { // Prints the Rows
            for(column = 1; column <= row; column++) { // Prints the Columns (for each increment of column, print a new column until same as number of rows)
                System.out.print(column + " "); // Output
            }
            System.out.println(); // Goes to next line
        }
        
        //PART II
        System.out.print("Enter the max size of your rectangle (choose a number 1-9): "); 
        int size = scan.nextInt();
        int row2, col; // Declare Variables (used row2 since row was used in Part I)
        int max = size * 2 - 1;
        int increase = 0;
        int decrease = 0;

        for(row2 = 0; row2 < max; row2++) { // For each row of the rectangle less than the max size, new row
                for (col = 0; col < max; col++) { // For each column of the rectangle less than the max size, new column
                    if(max - row2 - 1 < col)  { // If the maxiumum number minus the current row -1 is less than the current column, increase the counter
                        increase++; // increase the counter 
                    }
                    System.out.print(size - decrease + increase); // Output for printing the current row/col, using the increase/decrease counters to determine output
                    if(decrease < row2) { // If the decrease counter is less than the current row, increase it
                        decrease++;
                    }
                }
                increase = 0; // Resets the counter variables
                decrease = 0;
                System.out.println();
            }

            
        System.out.println();
        scan.close();
        }
}

