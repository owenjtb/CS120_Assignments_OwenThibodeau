import java.util.Scanner;   // Must be at the top of your file

public class Assignment3A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        double quotient = (double) num1 / num2;

        System.out.printf("The sum of %d and %d is %d\n", num1, num2, sum);
        System.out.printf("The product of %d and %d is %d\n", num1, num2, product);
        System.out.printf("The difference of %d and %d is %d\n", num1, num2, difference);
        System.out.printf("The quotient of %d and %d is %.10f\n", num1, num2, quotient);
        input.close();   // Good practice
    }
}