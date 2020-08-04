import java.util.Scanner;

public class DigitsLettersOther {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        StringBuilder letter = new StringBuilder(scan.nextLine());
        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < letter.length();i++){
            char symb = letter.charAt(i);
            if (Character.isDigit(symb)){
                numbers.append(symb);
            }else if (Character.isLetter(symb)){
                letters.append(symb);
            }else {
                symbols.append(symb);
            }

        }

        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
