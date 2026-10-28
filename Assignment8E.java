import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Assignment8E {     
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);

        int[][] pascal = new int[8][8];

        //create the edges
        for (int i = 0; i < pascal[0].length; i++) {
            //left edge
            pascal[i][0] = 1;
            //right edge
            pascal[i][i] = 1;
        }
        //create the inside (the important part)
        for (int row = 1; row < pascal.length; row++) {
            for (int col = 1; col < pascal[0].length; col++) {
                pascal[row][col] = pascal[row-1][col-1] + pascal[row-1][col];
            }
        }//worked first try because i am the greatest coder ever
        
        
    for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                if (pascal[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(pascal[i][j] + " ");
                }
            }
            System.out.println(); // Move to the next line after printing each row
    }

        
        

    }   
}
