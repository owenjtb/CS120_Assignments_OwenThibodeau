import java.util.Scanner;

public class Assignment9C {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        while (stop != true) {
            System.out.println("Convert inches to Centimeters (1) feet to centimeters (2) yards to meters (3) miles to km (4) quit (0)");
            int choice = input.nextInt();
            if (choice == 0) {
                stop = true;
                break;
            }
            System.out.println("Input length");
            int length = input.nextInt();
            
            
            switch (choice) {
                case 1: //inches
                    System.out.println(inches(length));
                    break;
                case 2: //feet
                    System.out.println(feet(length));
                    break;
                case 3: //yards
                    System.out.println(yards(length));
                    break;
                case 4: //miles
                    System.out.println(miles(length));
                    break;
                }
        }
    }

    public static double inches(int length) {
        return length * 2.54;
    }
    public static double feet(int length) {
        return length * 30.48;
    }
    public static double yards(int length) {
        return length * 0.91;
    }
    public static double miles(int length) {
        return length * 1.60;
    }
}