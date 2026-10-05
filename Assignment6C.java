import java.util.Scanner;
//i am the good bestest codeinger to ever
//cod
public class Assignment6C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("goig");
        int number = input.nextInt();
        //turn it into a string
        String nust = Integer.toString(number);
        //turn it into an array
        char[] nurt = nust.toCharArray();
        //get the length of the number
        int length = String.valueOf(number).length();
        //answer
        int answer = 0;

        for (int i = 0; i < length; i++) {
            answer += Character.getNumericValue(nurt[i]);
        }


        
        
        
        
        
        System.out.println(answer);
        input.close();
    }
}

