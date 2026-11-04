import java.util.Scanner;

public class Assignment9D {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        //for reminder heron's formula: s = (a + b + c) / 2, squareroot(s * (s - a) * (s - b) * (s - c)))
        System.out.print("input three sides of triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (isValidTriangle(a, b, c)) {
            double area = calculateArea(a, b, c);
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
//one method checks if the triangle is valid, another method calculates the area of the triangle
public static boolean isValidTriangle(double a, double b, double c) {
    return (a + b > c) && (a + c > b) && (b + c > a);
}
public static double calculateArea(double a, double b, double c) {
    double s = (a + b + c) / 2.0;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}
}