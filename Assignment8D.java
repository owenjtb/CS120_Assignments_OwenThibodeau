import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Assignment8D {     
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        
        System.out.println("how many numbers do you want to store");
        int[] array = new int[scanny.nextInt()];
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("input number %d \n", i + 1);
            array[i] = scanny.nextInt();
        }

        //get the mean
        double mean = Arrays.stream(array).sum() / array.length;
        
        
        //make an array that's filled with the differences from the mean
        double[] differences = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            differences[i] = array[i] - mean;
        }

        // make an array of squares of differences
        double[] squares = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            squares[i] = Math.pow(differences[i], 2);
        }

        //they're calling it the greatest data table ever made
        System.out.println("Number  Difference  Square");
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d      %f          %f \n", array[i], differences[i], squares[i]);
        }
        System.out.printf("Mean = %f\n", mean);
        // calculate the standard deviation
        double stddev = Math.sqrt(Arrays.stream(squares).sum() / array.length);
        System.out.printf("Standard Deviation = %f", stddev);
        
        



    }
}
