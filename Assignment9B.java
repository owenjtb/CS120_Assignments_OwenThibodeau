import java.util.Scanner;
public class Assignment9B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("input tempurature");
        int tempurature = input.nextInt();
        System.out.print("Convert Celsius to Fahrenheit (1) or Fahrenheit to Celsius (2)");
        if (input.nextInt() == 1) {
            System.out.print(ctf(tempurature));
        } else {
            System.out.print(ftc(tempurature));
        }
        
    }
    public static int ctf(int temps) {
        return (temps - 32) * 5 / 9;
    }
    public static int ftc(int temps) {
        return (temps * 9 / 5) + 32;
    }
}