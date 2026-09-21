import java.util.Scanner;
public class Assignment3E{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Input your first number:");
            int numberone = input.nextInt();

            System.out.println("Input your power:");
            int power = input.nextInt();

            System.out.print(Math.pow(numberone, power));

            input.close();
    }
}