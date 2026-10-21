import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Assignment8A {     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] twodarray = {
                // amy bill carmen dave ellen 
                {95, 56, 67, 89, 78}, // period 1
                {91, 59, 63, 82, 80}, // period 2
                {97, 55, 61, 85, 72}, // period 3
                {88, 67, 69, 81, 76}, // period 4
                {94, 62, 58, 91, 87}  // period 5
        };
        while (true != false) {
            
            
            // print the data
            for (int[] row : twodarray) {
                System.out.print(Arrays.toString(row));
                System.out.printf("\n");
            }
            
            System.out.println("Edit a mark? Choose row:");
            int ro = input.nextInt();
            System.out.println("Choose column:");
            int colum = input.nextInt();
            System.out.printf("Current mark is %d. Enter new mark.", twodarray[ro - 1][colum - 1]);
            twodarray[ro - 1][colum - 1] = input.nextInt();
        }   

        
    }
}


