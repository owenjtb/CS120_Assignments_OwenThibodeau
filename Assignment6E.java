import java.util.Scanner;
public class Assignment6E { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //report whether the number has one more ones than it does twos
        int done = 1;
        while (done != 0) {
                
            
            System.out.println("enter number");
            int n = input.nextInt();
            int sum = 0;
            
            int digit = 0; //not proud of this one line

            
            int ones = 0, twos = 0;
            

            while (n > 0) {
                //get the last digit and remove that digit
                digit = n % 10;
                n /= 10;
                
                switch (digit) {
                    case 1:
                        ones += 1;
                        break;
                    case 2:
                        twos += 1;
                    default:
                        break;
                }
            }

            System.out.printf("Your number has %d ones and %d twos.\n", ones, twos);
            if (ones == twos + 1) {
                System.out.printf("Your number qualifies.");
            } else {
                System.out.printf("Your number does not qualify.");
            }
            System.out.printf("\nDo you wish to continue? 1 = yes 0 = no");
            done = input.nextInt();
        }
        input.close();
    }
}

