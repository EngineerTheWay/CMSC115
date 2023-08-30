// Name: Way, Caleb      CMIS141/7385     Date: 
// Sixth Week Discussion

import java.util.Scanner;

public class WaySixthWeekDisc {

    /*
     * Excercise for the sixth week discussion.
     * 
     * Calculates the age the user is or will be in the current year using their birth year.
     * 
     */

        public static void yrCalc(String name, int bY, int cY) { 
            int age = cY - bY;
            System.out.println(name + ", you are or will turn " + age + " this year!");
        }

        public static void main(String[] args) { 

            Scanner sc = new Scanner(System.in); 

            System.out.print("What's your name? \n"); 
            String userName = sc.nextLine();
            System.out.print("Enter your birth year: "); 
            int birthYear = sc.nextInt();
            System.out.print("Enter the current year: "); 
            int currentYear = sc.nextInt();

            yrCalc(userName, birthYear, currentYear);

            sc.close(); // Closes the scanner "scan"
            }
            
}       
  