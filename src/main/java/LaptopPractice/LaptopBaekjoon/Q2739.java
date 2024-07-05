package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class Q2739 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int i;
        int a;

        a = s.nextInt();

        for (i = 1; i < 10; i++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }

}
