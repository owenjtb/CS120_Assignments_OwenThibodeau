import java.util.Scanner;
public class Assignment6G { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number");
        int number = input.nextInt();
        //guilty until proven innocent
        boolean prime = true;
        int primecoin = 0; //by gold get ritch
        //System.out.println((int) Math.sqrt(number)); 
        for (int i = 1; i <= number / 2; i++) { //you only need to check every number under the number divided by 2, obviously something can't be cleanly devided by more than half of t
            
            
            if (number % i == 0) { //
                primecoin += 1;
            } 
            if (primecoin == 2) {
                prime = true;
            }
           
        }
        if (prime == true){
            System.out.println("number is prime"); //primemaxxing
        } else {
            System.out.println("number is not prime");
        }
        input.close();
    }
}


