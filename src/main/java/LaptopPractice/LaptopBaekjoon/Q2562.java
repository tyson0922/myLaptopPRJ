package LaptopPractice.LaptopBaekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int maxInt = Integer.MIN_VALUE;
        int pos = 0;

        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();


            if (num > maxInt) {
                maxInt = num;
                pos = i;
            }
        }

        System.out.println(maxInt);
        System.out.println(pos + 1);

        sc.close();
    }
}
