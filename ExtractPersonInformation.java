import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number ; i++) {
            String input = scan.nextLine();
            String name = substringFromInput(input, '@', '|');
            String age = substringFromInput(input, '#', '*');

            System.out.println(String.format("%s is %s years old.", name, age));

        }
    }
    public static String substringFromInput(String input, char Start, char End){
        int indexStart = input.indexOf(Start) + 1;
        int indexEnd = input.indexOf(End);
        //String tmp = input.substring(1,3);
        String name = input.substring(indexStart, indexEnd);
        return name;
    }
}
