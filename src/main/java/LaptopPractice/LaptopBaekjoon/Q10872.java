package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int result =1;
        if (n >= 0 && n < 13){
            if (n == 0){
                result = 1;
                System.out.println(result);
            } else {
                while (i<n+1){
                    result = result * i;
                    i ++;
                }
                System.out.println(result);
            }
        }

    }
}
