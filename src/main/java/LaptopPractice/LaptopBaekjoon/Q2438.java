package LaptopPractice.LaptopBaekjoon;

import java.util.Scanner;

public class Q2438 {
//    public static void main(String[] args){
//        Scanner s = new Scanner(System.in);
//        int inputRowNumber = s.nextInt();
//        for (int printRow = 1; printRow < inputRowNumber+1; printRow++){
//            for(int printStar = 1; printStar < printRow + 1; printStar++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inputRowNumber = sc.nextInt();

        for (int rowNumber = 1; rowNumber < inputRowNumber + 1; rowNumber++){
            for(int starNum = 1; starNum < rowNumber + 1; starNum++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
