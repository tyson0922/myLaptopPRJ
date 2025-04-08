package LaptopPractice.LaptopBaekjoon;

import java.io.*;
import java.util.Scanner;

public class Q2439 {
    //    public static void main(String[] args) throws IOException{
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int starNum = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        int i, j, k;
//
//        for(i = 0; i < starNum; i++){
//            for (j = 1; j<starNum-i; j++){
//                sb.append(" ");
//            }
//            for (k = 0; k<starNum-j+1; k++){
//                sb.append("*");
//            }
//            bw.write(String.valueOf(sb));
//            bw.newLine();
//            sb.setLength(0);
//        }
//        bw.flush();
//    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputRowNum = sc.nextInt();

        for (int rowNum = 1; rowNum < inputRowNum + 1; rowNum++) {
            for(int blank = inputRowNum - 1; blank > rowNum - 1; blank--){
                System.out.print(" ");
            }
            for(int star = 1; star < rowNum + 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
