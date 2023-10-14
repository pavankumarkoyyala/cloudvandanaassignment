package assignment;
public class Pangram{
    public static void main(String[] args) {
        String input = "The five boxing wizards jump quickly";   
        boolean isPangram = checkIfPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String s) {
        s = s.toLowerCase();
        boolean[] present = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                int index = currentChar - 'a';
                present[index] = true;
            }
        }
        for (boolean isPresent : present) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
