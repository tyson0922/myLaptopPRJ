package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum=0;
        int cnt = s.nextInt();
        for (int i = 1; i < cnt+1;i++){
            sum += i;

        }
        System.out.println(sum);
    }
}
