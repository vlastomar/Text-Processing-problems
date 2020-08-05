import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String initial = scan.nextLine();
        String[] input = initial.split("\\s+");
        double result = 0.0;
        double finalResult = 0.0;

        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            StringBuilder numbrStr = new StringBuilder(word);
            numbrStr = numbrStr.deleteCharAt(0);
            numbrStr = numbrStr.deleteCharAt(numbrStr.length() -1);
            int number = Integer.parseInt(numbrStr.toString());
            if (word.charAt(0) >= 65 && word.charAt(0) <= 90){
                int intLetter = (int) word.charAt(0);
                intLetter = intLetter - 64;
                result = number * 1.0 / intLetter;
            }else if (word.charAt(0) >= 97 && word.charAt(0) <= 122){
                int intLetter = (int) word.charAt(0);
                intLetter = intLetter - 96;
                result = number * 1.0  * intLetter;
            }
            if (word.charAt(word.length() - 1) >= 65 && word.charAt(word.length() - 1) <= 90){
                int intLetter = (int) word.charAt(word.length() - 1);
                intLetter = intLetter - 64;
                result = result - intLetter;

            }else if (word.charAt(word.length() - 1) >= 97 && word.charAt(word.length() - 1) <= 122){
                int intLetter = (int) word.charAt(word.length() - 1);
                intLetter = intLetter - 96;
                result = result + intLetter;
            }
            finalResult += result;
            result = 0.0;
        }
        System.out.printf("%.2f",finalResult);

    }
}
