import java.util.Scanner;


public class Assignment5C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean funstillgoing = true;
        boolean got = false;
        while (funstillgoing != false) {
            int random = (int) (Math.random() * 100) + 1;
            int guesscount = 0;
            got = false;
            

            while (got != true) {
                //comment
                System.out.println("make your next guess");
                int guess = input.nextInt();
                
                if (guess < random) {
                    System.out.println("higher");
                    guesscount += 1;
                } else if (guess > random) {
                    System.out.println("lower");
                    guesscount += 1;
                } else if (guess == random) {
                    System.out.printf("congratulations you got it in %d guesses do you want to try again, type true for yes false for no \n", guesscount);
                    funstillgoing = input.nextBoolean();
                    got = true;
                }
            }
        }
    }
}

