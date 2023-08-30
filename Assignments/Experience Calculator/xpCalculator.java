// Name: Way, Caleb      CMIS141/7385     Date: 04/10/2023
// Assignment Three

import java.util.Scanner;
public class xpCalculator {

    /*
     * Assignment Three
     * 
     * Objective:
     * 
     * 1.  Prompt and read user’s input for the gamer's name, Level 1 XP (L1), Level 2 XP (L2),
     *     Level 3 XP (L3), and Engagement score (ES). User Scanner to read input.
     *     
     * 
     * 2.  Each XP score input should be in whole numbers between 10-100 and in increments of 5.
     *     The total XP score with bonuses should be calculated as follows: 
     * 
     *                  L1+L1*0.20+L2+L2*0.30+L3+L3*0.50+ES+ES*0.60
     * 
     * 3.  Output the gamer's information and the total calculated XP score (including bonuses).
     * 
     * 4.  Prompt the user as to whether they want to calculate total XP for another gamer
     *     and repeat the input/output processing
     * 
     * 5.  Allow user to exit the program without inputting gamer's data
     * 
     */

     public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in); // Creates the scanner used for input

        // Welcome message and instructions for the user
        System.out.println("Welcome to Character XP Calculator v1.0\n"); 

        // Declares the variables
        boolean nextCharacter = true; // Declares a variable for later use to determine if the user wants to calculaute another character.
        boolean firstCharCalculated = false; // Declares that the user has not entered a character yet.

        boolean newValidInput = false; // Boolean used to determine if the user provided a valid input.
        while (newValidInput == false && firstCharCalculated == false) { // While the user has provided no input or incorrect input AND the first character hasnt been calculated yet, runs this while loop.
            
            System.out.print("Would you like to calculate a character's XP? Y/N: ");
            String newCharacterPrompt = scan.next();

            if (newCharacterPrompt.equals("Y") || newCharacterPrompt.equals("y")) { // If input is valid AND user selected to calculate a character; escapes the loop and continues the program.
                System.out.println();
                newValidInput = true; // Ends this loop.
                nextCharacter = true; // Sets value to run second while loop; continues program.
            } else if (newCharacterPrompt.equals("N") || newCharacterPrompt.equals("n")) { // If input is valid AND user selected to not calculate a character; ends the program.
                System.out.println("\nThanks for using Character XP Calculator v1.0!");
                newValidInput = true; // Ends this loop.
                nextCharacter = false; // Sets value to divert second while loop; ends program.
            } else {
                System.out.println("\nPlease try again using 'Y' or 'N'...\n"); // If the users input is invalid; repeats this while loop.
                newValidInput = false;
                firstCharCalculated = false; 
            }
        }    

        while (nextCharacter == true) { // Runs this loop while the user has selected to calculate a(nother) character.

            // Gather character name
            scan.nextLine(); // resets scanner
            System.out.print("Enter character's name: ");
            String charName = scan.nextLine();

            // Gather character data
            System.out.print("Enter character's Level XP scores by level separated by space (L1 L2 L3 ES): ");
            int L1 = scan.nextInt();
            int L2 = scan.nextInt();
            int L3 = scan.nextInt();
            int ES = scan.nextInt();

            //Output name and data
            System.out.println("\nCharacter Name: " + charName);
            System.out.println("XP by Level and Engagement Score:" + " L1="+L1 + " L2="+L2 + " L3="+L3 + " ES="+ES);
            System.out.print("Final XP (with bonuses): ");
            System.out.printf("%.2f", ((L1+L1*0.20)+(L2+L2*0.30)+(L3+L3*0.50)+(ES+ES*0.60))); // Limits decimals to two places
            System.out.println("\n");

            boolean nextValidInput = false; // Boolean used to determine if the user provided a valid input.
            while (nextValidInput == false) { // Runs a third loop to see if the user wants to calculuate another character

                System.out.print("Would you like to calculate another character's XP? Y/N: ");
                String nextCharacterPrompt = scan.next();

                if (nextCharacterPrompt.equals("Y") || nextCharacterPrompt.equals("y")) {
                    System.out.println();
                    nextValidInput = true; // Ends this loop.
                    nextCharacter = true; // Repeats the second loop.
                    firstCharCalculated = true; // Diverts the first loop.
                } else if (nextCharacterPrompt.equals("N") || nextCharacterPrompt.equals("n")) {
                    System.out.println("\nThanks for using Character XP Calculator v1.0!");
                    nextValidInput = true; // Ends this loop.
                    nextCharacter = false; // Diverts the second loop; ends program.
                } else {
                    System.out.println("\nPlease try again using 'Y' or 'N'...\n"); // If the users input is invalid; repeats this while loop.
                    nextValidInput = false;
                }
            }
        }

        scan.close();

    }
} 
    