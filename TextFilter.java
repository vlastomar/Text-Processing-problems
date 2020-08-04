import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String stringManipulated = scan.nextLine();

        for (int i = 0; i < bannedWords.length; i++){
            String ban = bannedWords[i];
            String aster = asteriksWord(ban);
            stringManipulated = stringManipulated.replace(ban, aster);
        }
        System.out.println(stringManipulated);
    }
    public static String asteriksWord(String ban){
        int length = ban.length();
        String asterix = "";
        for (int i = 1; i <= length; i++ ){
            asterix += '*';
        }
        return asterix;
    }

}
