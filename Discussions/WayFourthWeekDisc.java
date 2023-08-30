// Name: Way, Caleb      CMIS141/7385     Date: 04/01/2023
// Fourth Week Discussion

import java.util.Scanner;
public class WayFourthWeekDisc {

    /*
     * Excercise for the fourth week discussion.
     * 
     * Counts down to zero for positive numbers, counts up to zero for negative numbers
     */

        public static void main(String[] args) { 

            Scanner scan = new Scanner(System.in); 
            System.out.print("Provide a whole number to count to zero from: "); 
            int inNum = scan.nextInt();

            if (inNum > 0) { // Checks positive numbers, then counts down to zero with a while loop
                System.out.println("Counting down from " + inNum + "...");
                while (inNum > 0) {
                    inNum--;
                    System.out.println(inNum);
                    
                }
            } else if (inNum < 0) { // Checks negative numbers, then counts up to zero with a while loop
                System.out.println("Counting up from " + inNum + "...");
                while (inNum < 0) {
                    inNum++;
                    System.out.println(inNum);
                    
                }
            } else { // Checks for input outside the expected range, in this case it is only 0
                System.out.println("You entered 0!");
            }
            
            
            scan.close(); // Closes the scanner "scan"
      }       
  }
  