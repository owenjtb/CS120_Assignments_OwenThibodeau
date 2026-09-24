import java.util.Scanner;

public class Assignment5B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i != 0) { //continue 1 yes 0 no
            System.out.println("Input:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int menu = input.nextInt();
            i = input.nextInt();

            switch (menu) {
                case 0: //add
                    System.out.print(num1 + num2);
                    break;
            
                case 1: //multiply
                    System.out.print(num1 * num2);
                    break;
                
                default:
                    System.out.println("fuh nah");
                    break;
            }
        }
        input.close();
    }
}
