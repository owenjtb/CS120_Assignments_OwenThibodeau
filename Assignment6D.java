public class Assignment6D { //putting code in a cauldron and making a potion of instant death
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            
            int answer = 0;
            char[] digits = String.valueOf(i).toCharArray();
            //
            for (int k = 0; k < digits.length; k++) {
                answer += digits[k];
            }
            System.out.println(answer);
        }
    }
}

