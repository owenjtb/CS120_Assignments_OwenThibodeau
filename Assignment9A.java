import java.util.Scanner;   

public class Assignment9A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            printResults(num1, num2);
            System.out.println("0 to continue 1 to break");
            if (input.nextInt() == 1){
                break;
            }
        }
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int product(int a, int b) {
        return a * b;
    }
    public static int difference(int a, int b) {
        return a - b;
    }
    public static double quotient(int a, int b) {
        return (double) a / b;
    }


    public static void printResults(int a, int b) {
        System.out.printf("The sum of %d and %d is %d\n", a, b, sum(a, b));
        System.out.printf("The product of %d and %d is %d\n", a, b, product(a, b));
        System.out.printf("The difference of %d and %d is %d\n", a, b, difference(a, b));
        System.out.printf("The quotient of %d and %d is %.10f\n", a, b, quotient(a, b));
    }
}