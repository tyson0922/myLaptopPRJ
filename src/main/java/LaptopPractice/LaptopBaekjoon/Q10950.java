package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args){
        int a , b, count;
        Scanner s = new Scanner(System.in);
        count = s.nextInt();

        for (int i = 0; i < count; i++){
            a = s.nextInt();
            b = s.nextInt();
            System.out.println(a + b);
        }

    }
}
