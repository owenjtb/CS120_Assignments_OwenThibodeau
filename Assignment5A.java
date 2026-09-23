import java.util.Scanner;

public class Assignment5A {
    public static void main(String[] args) {
        // write whether the number is greater less or equal to 50 
        Scanner input = new Scanner(System.in);
        int i = 1;
        
        
        while (i != 0) {
            System.out.printf("\nEnter a number:");
            int number = input.nextInt();
            i = number;
        
            if (number == 0) {
                
            } else if (number < 50) {
                System.out.printf("%d is less than 50", number);
            } else if (number == 50) {
                System.out.printf("%d is equal to 50", number);
            } else if (number > 50) {
                System.out.printf("%d is greater than 50", number);
            }
            
        }
        input.close();

        
    }
}