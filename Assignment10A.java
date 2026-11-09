import java.util.Scanner;
import java.util.Arrays;
public class Assignment10A {
    public static void main(String[] args) { 
        int[] array = {97, 81, 12, 34, 56, 21, 75, 44};
        //sort array in ascending order
        Arrays.sort(array);
        int[] ascendingsort = Arrays.copyOf(array, array.length);
        //sort array in descending order
        int[] descendingsort = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            descendingsort[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(ascendingsort));
        System.out.println(Arrays.toString(descendingsort));
    }
}