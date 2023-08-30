// Name: Way, Caleb      CMIS141/7385     Date: 4/29/2023

/*
 * 
 *  Imitates a microwave; creates a shortcut function so when the user selects a number on the keypad 
 *  it initiates a preset cooktime, "returns" the value to the microwave to be used, and
 *  displays a message to the "screen"
 * 
 */

import java.util.Scanner;

public class VirtualMicrowave {

    //Attributes
    public boolean isRunning;
    public int runtime;

    public void isRunning() {
        isRunning = true;
        System.out.println("(Virtual) Microwave is running.");
    }

    public void isNotRunning() {
        isRunning = false;
        System.out.println("(Virtual) Microwave is not running.");
    }

    public int mwShortcut(int inputNum) {
        
        if (inputNum == 1) {
            runtime = 30;
        } else if (inputNum == 2) {
            runtime = 45;
        } else if (inputNum == 3) {
            runtime = 60;
        } else if (inputNum == 4) {
            runtime = 90;
        } else if (inputNum == 5) {
            runtime = 120;
        } else if (inputNum == 6) {
            runtime = 180;
        } else if (inputNum == 7) {
            runtime = 240;
        } else if (inputNum == 8) {
            runtime = 300;
        } else if (inputNum == 9) {
            runtime = 480;
        } else if (inputNum == 0) {
            runtime = 600;
        } else {
            runtime = -1;
        }
    
        return runtime;
    }

    public void screenOutput(int seconds) {

        int minutes = (seconds/60);

        if (seconds <= 90) {
            String secondsOutput = "Cooking for " + seconds + " seconds.";
            System.out.println(secondsOutput);

        } else {
            String minutesOutput = "Cooking for " + minutes + " minutes.";
            System.out.println(minutesOutput);
        }
    }
        public static void main(String[] args) { 

            VirtualMicrowave microwave = new VirtualMicrowave();

            System.out.println("Welcome to your (Virtual) Microwave!");
            microwave.isNotRunning();

            Scanner scan = new Scanner(System.in);

            int inputValid = 0;
            do {

                System.out.print("\nEnter a number on the keypad for cooktime selection (0-9): ");
                int input = scan.nextInt();

                if ((input >= 0) && (input <= 9)) {
                    int cooktime = microwave.mwShortcut(input);
                    microwave.screenOutput(cooktime);
                    microwave.isRunning();
                    inputValid = 1;
                    
                } else {
                    System.out.print("That button doesn't exist on the keypad! Press 0-9.\n");
                    microwave.isNotRunning();
                }

            } while (inputValid == 0);

            scan.close(); 
      }       
  }
  