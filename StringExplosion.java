import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder letters = new StringBuilder(scan.nextLine());

        for (int i = 0; i <letters.length() ; i++) {
            char temp = letters.charAt(i);
            int bomb = 0;
            if (temp == '>'){
                for (int j = i+1; j < letters.length() ; j++) {
                    char temp1 = letters.charAt(j);
                    if (temp1 == '>'){
                        continue;
                    }else{
                        if (letters.charAt(j-1) == '>' && temp1 >= 48 && temp1 <= 57){
                            int tmp3 = Integer.parseInt(String.valueOf(temp1));
                            bomb += tmp3;
                            letters.deleteCharAt(j);
                            bomb -= 1;
                            j -= 1;
                        }    else{
                            if (bomb > 0){
                                letters.deleteCharAt(j);
                                bomb -= 1;
                                j -= 1;
                            }else if (bomb <= 0){
                                break;
                            }
                        }

                    }

                }
                //int bomb = (int)letters.charAt(i + 1);
            }
        }
        System.out.println(letters);
    }
}
