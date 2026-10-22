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
        // row
        
        for (int[] row : twodarray) {
            int rowsum = 0;
            for (int score : row) {
                rowsum += score;
            }
            System.out.println((double) rowsum / row.length);

        }
        
        // quest for the average of a column
        for (int i = 0; i < twodarray[0].length; i++) {
            int colsumn = 0;
            for (int[] row : twodarray) {
                colsumn += row[i];
                }
            System.out.println((double) colsumn / twodarray.length);
        }
    }
}


