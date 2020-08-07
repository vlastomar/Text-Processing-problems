import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] key = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String word = scan.nextLine();
        int count = 0;

        while(!"find".equals(word)){
            StringBuilder wordManip = new StringBuilder(word);
            for (int i = 0; i < wordManip.length() ; i++) {

                if (count == key.length){
                    count = 0;
                }
                int numb = key[count];
                char change =  wordManip.charAt(i);
                char newChar = (char)((int)change - numb);
                String newStr = newChar + "";
                wordManip.replace(i, i, newStr);
                wordManip.deleteCharAt(i+1);

                count++;
            }
            int index1 = wordManip.indexOf("&");
            int index2 = wordManip.lastIndexOf("&");
            String type = wordManip.substring(index1 + 1, index2);
            index1 = wordManip.indexOf("<");
            index2 = wordManip.indexOf(">");
            String coordinates = wordManip.substring(index1 + 1, index2);
            System.out.println(String.format("Found %s at %s", type, coordinates));

         word = scan.nextLine();
         count = 0;
        }
    }

}
