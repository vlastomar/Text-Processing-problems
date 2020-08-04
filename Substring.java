import java.util.Scanner;

public class Substring {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String wordToRemove = scan.nextLine();
        String stringManipulate = scan.nextLine();

        while (stringManipulate.contains(wordToRemove)){
            int index1 = stringManipulate.indexOf(wordToRemove);
            int index2 = index1 + wordToRemove.length();
            stringManipulate = stringManipulate.replace(wordToRemove, "");
        }
        /*StringBuilder stringForManipulating = new StringBuilder(scan.nextLine());

        while(stringForManipulating.toString().contains(wordToRemove)){
            int index =  stringForManipulating.indexOf(wordToRemove);
            stringForManipulating.delete(index, index + wordToRemove.length());
        }
        System.out.println(stringForManipulating);*/
        System.out.println(stringManipulate);



    }
}
