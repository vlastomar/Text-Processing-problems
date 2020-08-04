import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] inputString = scan.nextLine().split("\\s+");

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < inputString.length ; i++) {
            for (int j = 0; j < inputString[i].length() ; j++) {
                newString.append(inputString[i]);
            }
        }
        System.out.println(newString);
    }
}
