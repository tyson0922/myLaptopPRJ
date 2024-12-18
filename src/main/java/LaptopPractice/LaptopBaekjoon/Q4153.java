import java.util.ArrayList;
import java.util.Scanner;

public class Q4153 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int c = 1;

        ArrayList<String> result = new ArrayList<String>();

        while (a != 0 && b != 0 && c != 0) {
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                continue;
            }

            if (a > b && a > c) {
                if (a * a == b * b + c * c) {
                    result.add("right");
                } else {
                    result.add("wrong");
                }
            } else if (b > a && b > c) {
                if (b * b == a * a + c * c) {
                    result.add("right");
                } else {
                    result.add("wrong");
                }
            } else {
                if (c * c == a * a + b * b) {
                    result.add("right");
                } else {
                    result.add("wrong");
                }
            }


        }

        int i = 0;
        while (i < result.size()) {
            System.out.println(result.get(i));
            i++;
        }
    }
}
