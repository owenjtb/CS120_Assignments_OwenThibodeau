import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Assignment8C {     
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        
        int onerow = 0;
        int onecol = 0;
        int tworow = 0;
        int twocol = 0;

        char[][] tictactoe = {
            {'/','/','/'},
            {'/','/','/'},
            {'/','/','/'}
        };
        boolean win = false;
        int turns = 0;
        while (win != true) {
            
            //print the board
            for (char[] row : tictactoe) {
                System.out.println(row);
            }
            System.out.println("Player 1 (X) Row:");
            onerow = scanny.nextInt();
            System.out.println("Player 1 (X) Column:");
            onecol = scanny.nextInt();

            tictactoe[onerow-1][onecol-1] = 'X';
            
            turns += 1;
            if (turns == 9) break;
            //print the board (i don't know how to to methods yet)
            for (char[] row : tictactoe) {
                System.out.println(row);
            }

            System.out.println("Player 2 (O) Row:");
            tworow = scanny.nextInt();
            System.out.println("Player 2 (O) Column:");
            twocol = scanny.nextInt();

            tictactoe[tworow-1][twocol-1] = 'O';
            turns += 1;
            //print the board (i still don't know how to to methods yet)
            for (char[] row : tictactoe) {
                System.out.println(row);
            }
            
            
            
        }
        //print the board (i wish i knew how to do methods)
        System.out.println("game finish");
        for (char[] row : tictactoe) {
            System.out.println(row);
        }
    }
}


