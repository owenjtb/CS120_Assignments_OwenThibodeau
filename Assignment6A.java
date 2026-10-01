import java.util.Scanner;


public class Assignment6A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("number: ");
        int number = input.nextInt();

        int mod = number % 2;

        if (mod == 1) {
            System.out.printf("%d is odd", number);
        } else if (mod == 0) {
            System.out.printf("%d is even", number);
        }
        
        input.close();
    }
}

