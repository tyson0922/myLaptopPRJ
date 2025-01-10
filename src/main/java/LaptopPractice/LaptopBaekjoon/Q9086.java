package LaptopPractice.LaptopBaekjoon;

import java.io.*;
import java.util.Scanner;

public class Q9086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int row = Integer.parseInt(br.readLine());
        String input;

        /*
        for any number of rows of input
        while((input = br.readLine()) != null){
            if (!input.isEmpty()){

                sb.append(input.substring(0,1));
                sb.append(input.substring(input.length() -1));
                bw.write(String.valueOf(sb));
                bw.newLine();

                sb.setLength(0);
            } else {
                break;
            }
        }
        */

        for(int i = 0; i<row; i++){
            input = br.readLine();
            sb.append(input.substring(0,1));
            sb.append(input.substring(input.length() - 1));

            bw.write(String.valueOf(sb));
            bw.newLine();

            sb.setLength(0);
        }
        bw.flush();
    }
}
