import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Assignment7A { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        int[] avarray = new int[10];
        int length = 0;
        //filling the array
        for (int i = 0; i < 10; i++) {
            
            System.out.printf("Input number %d\n", i + 1);
            avarray[i] = input.nextInt();
            
            if (avarray[i] == 0){
                length = i;
                break;
            }
            
        }
        //make a new array without all those pesky zeroes
        int[] bestarray = Arrays.copyOf(avarray, length);

        System.out.print((double) IntStream.of(bestarray).sum() / length);
        
        input.close();
    }
}


