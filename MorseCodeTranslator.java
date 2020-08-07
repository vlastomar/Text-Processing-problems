
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
         "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };


       //StringBuilder input = new StringBuilder(scan.nextLine());
        String[] words = scan.nextLine().split("\\s+");
        StringBuilder input = new StringBuilder();
        List<String> message = new ArrayList<>();


        for (int i = 0; i < words.length ; i++) {
            String temp = words[i];
            if ("|".equals(temp)){
                String addToList = " ";
                message.add(addToList);

            }else{
                for (int j = 0; j < morse.length ; j++) {
                    if (temp.equals(morse[j])){
                        int letter = j + 65;
                        char lett = (char)letter;
                        String addToList = lett + "";
                        message.add(addToList);
                    }
                }
            }
        }
        for (String wor : message ){
            System.out.print(wor);
        }

    }
}
