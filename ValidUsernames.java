import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        //StringBuilder letter = new StringBuilder();
        Boolean check = true;

        for (int i = 0; i < input.length ; i++) {
            String password = input[i];
            for (int j = 0; j < password.length() ; j++) {
                char symb = password.charAt(j);
                if (Character.isLetter(symb) || Character.isDigit(symb) || symb == '-' || symb == '_'){

                }else{
                    check = false;
                    break;
                }

            }
            if (check && password.length() > 3 && password.length() < 16){
                System.out.println(password);
            }
            check = true;
        }
    }
}
