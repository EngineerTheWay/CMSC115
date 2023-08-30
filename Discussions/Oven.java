import java.util.Scanner;

public class Oven {
    //Attributes
    public boolean isOn;
    private int ovenTemp = 0;

    //Turns oven on, set to off by default
    public void turnOn() {
        isOn = true;
        System.out.println("Oven is on.");
    }

    //Turns oven off, set to off by default
    public void turnOff() {
        isOn = false;
        System.out.println("Oven is off.");
    }

    //Sets temperature
    public void setTemp(int degrees) {
        ovenTemp = degrees;
        System.out.println("The oven is set to " + ovenTemp + " degrees.");

    }
    //Displays status of oven, only asks what food you are cooking if oven has already been turned on
    public void ovenStatus(){
        System.out.println("The oven is " + (isOn ? "on":"off") + " with the temperature set to " + ovenTemp + " degrees.");
    }

    public static void main(String[] args) {
        //Initializes object and calls methods
        Oven myOven = new Oven();

        System.out.println("Welcome to myOven");
        myOven.ovenStatus();

        System.out.println("\nSelect an option:");
        System.out.println("1) Status 2) Turn On 3) Turn Off 4) Set Temp 5) (Exit)\n");

        Scanner scanner = new Scanner(System.in);

        int userInterface = 1;
        do {
            
            System.out.print("Option Select: ");
            int menuSelect = scanner.nextInt();

            if (menuSelect == 1) {
                myOven.ovenStatus();
            } else if (menuSelect == 2) {
                myOven.turnOn();
            } else if (menuSelect == 3) {
                myOven.turnOff();
            } else if (menuSelect == 4) {
                System.out.print("Enter Desired Temp (F): ");
                int degrees = scanner.nextInt();
                myOven.setTemp(degrees);   
            } else if (menuSelect == 5) {
                userInterface = 0;
            } else {
                System.out.println("Invalid Selection");
            }
            
        } while (userInterface == 1);


        scanner.close();
    }

}
