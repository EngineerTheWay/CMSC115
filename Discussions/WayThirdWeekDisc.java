// Name: Way, Caleb      CMIS141/7385     Date: 03/10/2023
// Third Week Discussion

import java.util.Scanner;

public class WayThirdWeekDisc {

    /*
     * Excercise for the third week discussion.
     * 
     * Obtains input from user for their age, then responds with various responses based off of their age.
     */

        public static void main(String[] args) { 

            Scanner sc = new Scanner(System.in); 

            System.out.println("Age Authentication. . ."); 
            System.out.println("What is your age?"); 
            int age = sc.nextInt();

            if (age <= 21) {  // Conditional statement checks if user is aged 21 or older, then uses a nested conditional statement to check for other conditions.
                if (age < 21 && age >= 18) // Checks if the user is over 18, but under 21.
                    System.out.println("Congrats, you can vote!"); 
                else if (age == 21) // Checks if the user is 21.
                    System.out.println("You can wine and dine!");
                else // Checks if the user is 18 or younger.
                    System.out.println("Still but a young 'un.");
            } else { // If the user is over 21, responds with this.
                System.out.println("Enjoying those adult responsibilites."); 
            }
            
            sc.close(); // Closes the scanner "scan"
      }       
  }
  