package LaptopPractice.LaptopBaekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args){

        int a = 1;
        int b = 1;
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        while (a != 0 && b != 0){
            a = s.nextInt();
            b = s.nextInt();
            if (a != 0 && b != 0) {
                result.add(a + b);
            }
        }
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
