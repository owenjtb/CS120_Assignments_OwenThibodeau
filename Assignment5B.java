import java.util.Scanner;

public class Assignment5B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i != 0) { //continue 1 yes 0 no
            System.out.println("Input:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int menu = input.nextInt();
            i = input.nextInt();

            switch (menu) {
                case 0: //add
                    System.out.print(num1 + num2);
                    break;
            
                case 1: //multiply
                    System.out.print(num1 * num2);
                    break;
                
                default:
                    System.out.println("t.nextInt();\r\n" + //
                                                "            int menu = input.nextInt();\r\n" + //
                                                "            i = input.nextInt();\r\n" + //
                                                "\r\n" + //
                                                "            switch (menu) {\r\n" + //
                                                "                case 0: //add\r\n" + //
                                                "                    System.out.print(num1 + num2);\r\n" + //
                                                "                    break;\r\n" + //
                                                "            \r\n" + //
                                                "                case 1: //multiply\r\n" + //
                                                "                    System.out.print(num1 * num2);\r\n" + //
                                                "                    break;\r\n" + //
                                                "                \r\n" + //
                                                "                default:\r\n" + //
                                                "                    System.out.prin");
                    break;
            }
        }
        input.close();
    }
}
