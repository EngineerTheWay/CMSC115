// Name: Way, Caleb      CMIS141/7385  Assignment Five

import java.util.Scanner; 

public class unitConverter { 

    /*
     * Assignment Five
     *  
     * Objective:
     *  1. Prompt the user on which action they want to take:
     *     a. Convert cubic feet to U.S. bushels
     *     b. Convertmilestokilometers
     *     c. Determine graduation with honors title
     *     d. Exit program
     * 
     *  2. Programs at a minimum must have the following methods:
     *     a. Convert cubic feet method that gets cubic feet and returns U.S.bushels.
     *     b. Convert to kilometers method that gets miles and returns kilometers
     *     c. Determine graduation with honors title method that gets GPA and returns honors title value (category)
     * 
     *  3. For each action, the user should be prompted for corresponding data and provided the appropriate result as output.
     * 
     *  4. Users should be able to select one action via the menu and then get prompted again for another menu selection until 
     *     they select the exit choice.
     * 
     */

    public static void cftToBushel(int cft) { 
        double bushels = cft * .803564;
        System.out.printf(cft+" Cubic Feet = "+bushels+" U.S. Bushels\n");
    }

    public static void milesToKM(double miles) { 
        double km = miles * 1.60934;
        System.out.println(miles+" Miles = "+km+" Kilometers\n");
    }

    public static void hnrsGPA(double GPA) { 

            switch(((GPA >= 4)) ? 0 :
                   ((GPA >= 3.8) && (GPA < 4)) ? 1 :
                   ((GPA >= 3.5) && (GPA < 3.8)) ? 2 : 3) {
            
                case 0:
                    System.out.println("Congratulations, you have graduated Summa Cum Laude!\n");
                    break;
                case 1:
                    System.out.println("Congratulations, you have graduated Magna Cum Laude!\n");
                    break;
                case 2:
                    System.out.println("Congratulations, you have graduated Cum Laude!\n");
                    break;
                case 3:
                    System.out.println("Sorry, you didn't graduate with an honors title!\n");
                    break;
            }
    }

    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in); 

        boolean continueProgram = true;
        boolean runAgain = true;

        continueProgram: // Label used to break if the user exits
        while(continueProgram == true) {

            while(runAgain == false) { // Runs after the user has run the program once, asks if the user wants to continue the program or not.
                System.out.println("Run program again?");
                System.out.println("(1) Yes");
                System.out.println("(2) No");
                System.out.print("Option Select: ");
                int userRunAgain = scan.nextInt();
                System.out.println();

                if (userRunAgain == 1) {
                    runAgain = true; // Ends this nested loop
                    continueProgram = true; //Redundant, continues parent loop
                } else if (userRunAgain == 2) {
                    runAgain = true; // Ends this nested loop
                    continueProgram = false; // Ends parent loop
                    System.out.println("Exitting program.");
                    break continueProgram; // Ends program; continueProgram label to break. I wasn't sure how to break otherwise with how I set up this while loop.
                } else  {
                    runAgain = false;
                }
            }

            System.out.println("              *** MENU ***");
            System.out.println("Select an option below by entering 1-4 . . .\n");
            System.out.println("(1) Convert cubic feet to U.S. Bushels");
            System.out.println("(2) Convert miles to kilometers");
            System.out.println("(3) Determine graduation honors title using GPA");
            System.out.println("(4) Exit Program");
            System.out.println();
            System.out.print("Option Select: ");
            int userInput = scan.nextInt();

            //Menu Selection Options - user must choose a valid input or the loop will repeat.
            if (userInput == 1) { // option to convert cubic ft to bushels; uses method
                System.out.print("\nEnter Cubic Feet: ");
                int cft = scan.nextInt();
                cftToBushel(cft);
                runAgain = false; // Sets criteria to ask the user if they want to run again.
                continueProgram = true; // Repeats this loop; user will be prompted if they want to run again.
            } else if (userInput == 2) { // option to convert miles to KM; uses method
                System.out.print("\nEnter Miles: ");
                double miles = scan.nextDouble();
                milesToKM(miles); 
                runAgain = false; // Sets criteria to ask the user if they want to run again.
                continueProgram = true; // Repeats this loop; user will be prompted if they want to run again.
            } else if (userInput == 3) { // Option to calculate honors title; uses method
                System.out.print("\nEnter your GPA: ");
                double GPA = scan.nextDouble();
                hnrsGPA(GPA); 
                runAgain = false; // Sets criteria to ask the user if they want to run again.
                continueProgram = true; // Repeats this loop; user will be prompted if they want to run again.
            } else if (userInput == 4) { // Option to exit program.
                System.out.println("\nExitting program.");
                continueProgram = false; // Exits this loop; ends the program.
            } else { // Checks for valid input.
                System.out.println("\nInvalid selection! Try again.\n");
                runAgain = true; // This value skips the first loop. 
                continueProgram = true; // Repeats this loop; skips prompting if the user wants to run again, reprompts the "menu"
            }

        }
        scan.close();
    }
}

