import java.util.Scanner;
public class Assignment6F { 
    public static void main(String[] args) {
        int onesmorethantwos = 0;
        //big fucking mess
        for (int i = 1; i <= 999; i++) {
            //the idea is for these two variables to reset every time
            int ones = 0, twos = 0;
            System.out.printf("%d, so far %d\n", i, onesmorethantwos);
            
            //so stupid i forgot to do this part
            int newi = i;
            while (newi > 0) {
                int digit = newi % 10;
                newi /= 10;
                
                switch (digit) {
                    case 1:
                        ones += 1;
                        break;
                    case 2:
                        twos += 1;
                    default:
                        break;
                }
            }

            if (ones == twos + 1){
                    onesmorethantwos += 1;
                }
            
            
        } // if i told you
        System.out.println(onesmorethantwos);
        
    }
}


