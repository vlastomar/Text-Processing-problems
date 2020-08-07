import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String title = scan.nextLine();
        String content = scan.nextLine();
        System.out.println(String.format("<h1>\n%s\n</h1>", title));
        System.out.println(String.format("<article>\n%s\n</article>", content));

        String comment = scan.nextLine();
        while (!"end of comments".equals(comment)){
            System.out.println(String.format("<div>\n%s\n</div>", comment));
            comment = scan.nextLine();
        }
    }
}
