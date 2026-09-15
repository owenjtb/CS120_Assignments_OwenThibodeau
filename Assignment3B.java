import java.util.Scanner;


public class Assignment3B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:");
        double number = input.nextDouble();

        System.out.printf("The square of %f is %f\n", number, Math.pow(number, 2));
        System.out.printf("The cube of %f is %f\n", number, Math.pow(number, 3));
        System.out.printf("The fourth power of %f is %f\n", number, Math.pow(number, 4));
        input.close();
    }
}