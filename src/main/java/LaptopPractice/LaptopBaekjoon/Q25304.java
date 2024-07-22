package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long X = s.nextLong();
        int N = s.nextInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {

            int a = s.nextInt();
            int b = s.nextInt();

            sum = a * b + sum;
        }

        if (sum == X) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }

    }
}
