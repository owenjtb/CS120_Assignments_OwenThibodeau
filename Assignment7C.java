import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Assignment7C { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int amount = 100;
        int[] diceRolls = new int[amount]; 
        int[] probabilities = new int[11]; // from 2 - 12

        for (int i = 0; i < amount; i++) {
            //add two dice together
            int sum = (int)(Math.random() * 6) + 1 + (int)(Math.random() * 6) + 1;
            diceRolls[i] = sum;
            
        }
        
        for (int sum : diceRolls) { // 
            probabilities[sum - 2]++;
        }
        
        for (int probability : probabilities) {
            
            System.out.printf("%d %d \n", probability, probability / 11.0 * 100); //plain probability
            
        }
        input.close();
    }
}


