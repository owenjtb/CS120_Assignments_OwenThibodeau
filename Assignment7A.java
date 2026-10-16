import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Assignment7A { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gameing = 1;
        // System.out.println("type 1 to continue 0 to stop");
        // gameing = input.nextInt();
        
        int[] avarray = new int[10];
        
        //filling the array
        for (int i = 1; i < 10; i++) {
            
            System.out.printf("Input number %d\n", i);
            avarray[i] = input.nextInt();
            
            if (avarray[i] == 0){
                break;
            }
            
        }
        
        System.out.print(IntStream.of(avarray).sum() / avarray.length);
        
        input.close();
    }
}


