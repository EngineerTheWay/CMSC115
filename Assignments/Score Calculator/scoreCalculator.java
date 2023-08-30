// Name: Way, Caleb      CMIS141/7385     Date: 04/29/2023
// Assignment Six

import java.util.Scanner;

public class WayAssignmentSix { // Declares the WayAssignmentOne class

    /*
     * Assignment Six
     * Objective:
     * 
     * 1. Prompt the user for the number of teams in the competition to be tracked.
     * 
     * 2. For each robotics team have the user enter team's name and aggregate score from the
     *    judges. (400-1000)
     * 
     * 3. Store robotics team names and scores in separate arrays
     * 
     * 4. Code a method that gets an integer array and uses for-loop to find the index of the
     *    smallest value
     * 
     * 5. Code a method that gets an integer array and uses for-loop to find the index of the
     *    largest value
     * 
     * 6. Output all robotics teams with their aggregate scores.
     * 
     * 7. Output the team that has the highest aggregate score and the team that has the
     *    lowest aggregate score.
     * 
     */


     // Finds index of the smallest value in an integer array
    public static int calcSmallest(int[] array){
        int index = 0;
        int min = array[index];

        for (int i = 1; i < array.length; i++){
            if (array[i] < min) { // Checks if the value of the current index's value is smaller than the previously declared smallest value, if so set it as the new smallest index.
                min = array[i]; 
                index = i;
            }
        }
        return index;
    }

    // Finds index of the largest value in an integer array
    public static int calcLargest(int[] array){
        int index = 0;
        int max = array[index];
    
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) { // Checks if the value of the current index's value is larger than the previously declared largest value, if so set it as the new smallest index.
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in); 

        //Input from the user to get the number of teams they want to record/calculate.
        System.out.print("How many teams? "); 
        int numTeams = scan.nextInt();

        //Declares arrays equal to the length of the number of teams they want to record/calculate
        String teamNames[] = new String[numTeams];
        int teamScores[] = new int[numTeams];

        //Input from the user to get name and scores of the teams
        for (int i = 0 ; i < teamNames.length ; i++) {
            System.out.println("\nTeam " + (i + 1) + ":"); 
            System.out.print("What is the team's name? "); 
                teamNames[i] = scan.next();

            // While loop gets users input for team score; ensures the input is within the expected range.
            int inputLoop = 1;
            while (inputLoop == 1) {
                System.out.print("What score did the " +teamNames[i]+ " get (400-1000)? ");
                teamScores[i] = scan.nextInt();
                if ((teamScores[i] >= 400) && (teamScores[i] <= 1000)) {
                    inputLoop = 0;
                } else {
                    System.out.print("You must enter a score between 400-1000.\n");
                }
            }
                
        }

        // Outputs all the teams and their aggregate scores
        System.out.println("\n*** All Team Scores ***"); 
        for (int i = 0 ; i < teamNames.length ; i++) {
            System.out.println(teamNames[i] + "'s aggregate score was " + teamScores[i]);
        }

        //Calls methods to determine the largest and smallest scores to be used to output to the user
        int largestIndex = calcLargest(teamScores);
        int smallestIndex = calcSmallest(teamScores);

        // Output to the user using the variable
        System.out.println(); // Space
        System.out.println("The " + teamNames[largestIndex] + " ranked the highest with a score of " + teamScores[largestIndex] +".");
        System.out.println("The " + teamNames[smallestIndex] + " ranked the lowest with a score of " + teamScores[smallestIndex] +".");

        scan.close(); 
    }
}