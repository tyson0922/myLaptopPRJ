package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class Q2754 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] grades = {"A+","4.3", "A0","4.0","A-","3.7",
                "B+","3.3", "B0", "3.0", "B-","2.7",
                "C+","2.3", "C0", "2.0", "C-","1.7",
                "D+","1.3", "D0","1.0", "D-", "0.7",
                "F","0.0"};
        String inputGrade = sc.next();

        for(int i = 0; i< grades.length; i+=2){
            if(grades[i].equals(inputGrade)){
                System.out.println(grades[i+1]);
            }
        }

    }
}
