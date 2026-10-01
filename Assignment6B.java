import java.util.Scanner;


public class Assignment6B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stop = 1;
        while (stop != 0) {
            System.out.println("Input two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            //to find out if the numbers are divisible i divide them then use modulus 1, if the answer is not zero it's a decimal which means it cannot divide
            double divvy = (double) num1 / num2;
            double mod = divvy % 1;
            
            if (mod != 0) {
                System.out.printf("%d and %d are not evenly divisible", num1, num2);
            } else {
                System.out.printf("%d and %d are evenly divisible", num1, num2);
            }
            
            System.out.println("\nContinue? 0 = Yes 1 = No");
            stop = input.nextInt();
        }
    }
}

