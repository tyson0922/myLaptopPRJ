import java.util.Scanner;

public class Q27866 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int i = scanner.nextInt();

        if (S.length() < 1001){
            System.out.println(S.substring(i-1,i));
        }
    }
}
