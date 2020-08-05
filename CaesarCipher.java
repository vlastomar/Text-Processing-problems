import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        StringBuilder inputFromStr = new StringBuilder();

        for (int i = 0; i <input.length() ; i++) {

            int temp = input.charAt(i);
            int temp1 = temp + 3;
            char newCh = (char) temp1;
            String forReplac = newCh + "";
            inputFromStr = inputFromStr.append(forReplac) ;
        }
        System.out.println(inputFromStr);

    }
}
