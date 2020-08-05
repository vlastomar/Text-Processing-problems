import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\\\");

        String last =  input[input.length -1];
        String[] result = last.split("\\.");
        System.out.println("File name: " + result[0]);
        System.out.println("File extension: " + result[1]);

    }
}
