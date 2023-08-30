// Name: Way, Caleb      CMIS141/7385     Date: 4/29/2023
// Seventh Week Discussion

import java.util.Arrays;
import java.util.Scanner;

public class WaySeventhWeekDisc {

    /*
     * Excercise for the seventh week discussion.
     * 
     * Calculates user's assignment score based off of the number of points per section on the rubric.
     */


     public static int[] calcGrade(int[] userScores, int scoreTotal) { 

        int calcScores[] = new int[userScores.length]; // Array to store modified values.

        // Calculations based on the users input. Adds the modified values to the new array.
        if (scoreTotal == 300) {
            for (int i = 0 ; i < userScores.length ; i++) {
                calcScores[i] = userScores[i] * 12; 
            }
        } else {
            for (int i = 0 ; i < userScores.length ; i++) {
                calcScores[i] = userScores[i] * 4; 
            }
        }

        return calcScores; // Returns modified array
    }

    public static void main(String[] args) { 

        // Declares array, opens scanner
        Scanner sc = new Scanner(System.in); 
        int score[] = new int[5];

        //Input
        System.out.print("What was your rubric score for section one (0-5)? "); 
        score[0] = sc.nextInt();
        System.out.print("What was your rubric score for section two  (0-5)? "); 
        score[1] = sc.nextInt();
        System.out.print("What was your rubric score for section three  (0-5)? "); 
        score[2] = sc.nextInt();
        System.out.print("What was your rubric score for section four  (0-5)? "); 
        score[3] = sc.nextInt();
        System.out.print("What was your rubric score for section five (0-5)? "); 
        score[4] = sc.nextInt();

        System.out.println("Your rubric scores were: " + Arrays.toString(score));

        //Asks the user how many points does the assignment have total
        System.out.print("What are the total points of the assignment (100 or 300)? "); 
        int totalPoints = sc.nextInt();

        //Calls calcGrade method
        int[] userFinalScores = calcGrade(score, totalPoints);

        //Int used to display the final user grade out of the total points
        int userFinalGrade = 0;

        //Adds array numbers together
        for (int j = 0 ; j < userFinalScores.length ; j++) {
            userFinalGrade += userFinalScores[j]; 
        }

        //Prints output 
        System.out.println("Your final total score was " + userFinalGrade + "/" + totalPoints + " points.");

        sc.close(); // Closes the scanner
        
      }       
  }
  