package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class Q2744 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputWord = sc.next();
        StringBuilder outputWord = new StringBuilder();

        for (int i = 0; i<inputWord.length(); i++){
            if (inputWord.substring(i,i+1).equals(inputWord.substring(i,i+1).toUpperCase())){
                outputWord.append(inputWord.substring(i, i + 1).toLowerCase());
            } else {
                outputWord.append(inputWord.substring(i, i + 1).toUpperCase());
            }
        }
        System.out.println(outputWord);
    }
}
