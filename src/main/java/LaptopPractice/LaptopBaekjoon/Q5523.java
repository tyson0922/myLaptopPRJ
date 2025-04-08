package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class Q5523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a, b;

        int aWin = 0;
        int bWin = 0;

        for (int rowNum = 1; rowNum < n + 1; rowNum++) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a > b) {
                aWin++;
            }
            if (a < b) {
                bWin++;
            }

        }
        System.out.println(aWin + " " + bWin);

    }
}
