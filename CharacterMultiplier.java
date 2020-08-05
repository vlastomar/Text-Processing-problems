import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        String word1 = input[0];
        String word2 = input[1];
        int len1 = word1.length();
        int len2 = word2.length();

        if (len1 >= len2){
            calculChart(word1,word2);
        }else if (len2 > len1){
            calculChart(word2, word1);
        }
    }
    public static void calculChart(String word1, String word2){
        int result = 0;
        for (int i = 0; i < word2.length() ; i++) {
            int temp = word1.charAt(i) * word2.charAt(i);
            result += temp;
        }
        for (int i  = 0; i < word1.length() - word2.length() ; i++) {
            result += word1.charAt(word1.length() - 1 - i);
        }
        System.out.println(result);
    }
}

