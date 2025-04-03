package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

import static java.lang.Math.sin;

public class Q10101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a + b + c == 180) {
            if (a == b && b == c) {

                System.out.println("Equilateral");

            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
