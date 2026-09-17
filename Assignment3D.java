import java.util.Scanner;
public class Assignment3D {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);            
            
            int radius = 0;
            System.out.println("Please enter a radius");
            radius = input.nextInt();

            System.out.print(Math.PI * Math.pow(radius, 2));
            
            
            
            input.close();
    }
}