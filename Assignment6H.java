import java.util.ArrayList;
import java.util.Scanner;
public class Assignment6H { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        
        //get every prime under number and add them to the prime list 
        
        
        int primetime = 1;
        while (primetime == 1) {
            ArrayList<Integer> primelist = new ArrayList<>();
            //im the best
            // 
            System.out.print("Enter Number:");
            int number = input.nextInt();

            for (int l = 1; l <= number / 2; l++) {
                
                int primecoin = 0;
                boolean prime = false;
                for (int i = 1; i <= l; i++) { //prime finder. the prinder grinder
                        
                    //find the amount of numbers that cleanly divide the number
                    if (l % i == 0) { //l mod i not number mod i you big dummy
                        primecoin += 1;
                    } 
                    //end  
                        
                }

                //other important stuff
                if (primecoin == 2) {
                    prime = true;
                }//
                    
                if (prime == true){
                    if (number % l == 0){
                        primelist.add(l);
                    }
                }
            

            }
            System.out.println(primelist);
            System.out.println("Continue? 1 for yes 0 for no");
            primetime = input.nextInt();
        }
    input.close();
    
    }
}