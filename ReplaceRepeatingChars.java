import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String result   = "";
        char letter = '0';

        for (int i = 0; i < input.length() ; i++) {
            char temp = input.charAt(i);
            if (temp != letter){
                letter = temp;
                System.out.print(letter);
            }
        }
    }
}
