import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstCh = scan.nextLine().charAt(0);
        char secondCh = scan.nextLine().charAt(0);
        String input = scan.nextLine();
        int numb1ASC = firstCh;
        int nubm2ASC = secondCh;
        int sum = 0;
        for (int i = 0; i < input.length() ; i++) {
            if (nubm2ASC < numb1ASC){
                sum += charBetween(input.charAt(i), numb1ASC, nubm2ASC);
            }else if (nubm2ASC > numb1ASC){
                sum += charBetween(input.charAt(i), nubm2ASC, numb1ASC);
            }

        }
        System.out.println(sum);
    }
    public static int charBetween(char input, int numb1, int numb2){
        int numb = 0;
        if (input < numb1 && input > numb2){
            numb = input;
        }
        return numb;
    }
}
