import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while(!"end".equals(input)){
            String reversed = "";
            for(int i = input.length() - 1; i >= 0; i--){
                reversed += input.charAt(i);

            }
            System.out.println(input + " = " + reversed);
            input = scan.nextLine();
        }
    }
}
