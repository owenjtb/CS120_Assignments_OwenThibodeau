import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Assignment7B { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int going = 1;
        // parallel arrays for planets, moons, and distances from the sun

        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        int[] moons = {0, 0, 1, 2, 16, 18, 15, 8, 1};
        int[] distances = {58, 108, 150, 228, 778, 1427, 2869, 4498, 5900};
        
        // allow repetition
        while (going == 1) {
            System.out.println("Pick a planet by number (1-9):");
            int planetIndex = input.nextInt() - 1; // Convert to 0-based index

            if (planetIndex >= 0 && planetIndex < planets.length) {
                System.out.println("Planet: " + planets[planetIndex]);
                System.out.println("Moons: " + moons[planetIndex]);
                System.out.println("Distance from Sun: " + distances[planetIndex] + " million km");
            } else {
                System.out.println("Invalid.");
            }
            System.out.println("Continue? 1 = Yes 2 = No");
            going = input.nextInt();
        }

        input.close();
    }
}


