import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Assignment8B {     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] twodarray = {
                // 
                {87, 73, 88, 92}, // student 1
                {65, 57, 69, 60}, // student 2
                {52, 57, 62, 53}, // student 3
            
        };
        
        for (int[] row : twodarray) {
            int sum = 0;
            for (int score : row) {
                sum += score;
                
            }
            System.out.println(sum / row.length);
            
        }

        
    }
}


