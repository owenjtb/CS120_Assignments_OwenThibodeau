public class Assignment4D {
        public static void main(String[] args) {
            String number = "Number";
            String square = "Square";
            String cube = "Cube";

            System.out.printf("Sample output: \n" +
                              "Squares and cubes of 1-10 \n" +
                              "%-10s%-10s%-10s\n", number, square, cube); // two spaces between
            for (double i = 1; i <= 10; i++) {
                System.out.printf("%-10.0f%-10.0f%-10.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
            }
                
            }
}