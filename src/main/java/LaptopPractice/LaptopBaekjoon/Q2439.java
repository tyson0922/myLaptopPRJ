package LaptopPractice.LaptopBaekjoon;

import java.io.*;

public class Q2439 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int starNum = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int i, j, k;

        for(i = 0; i < starNum; i++){
            for (j = 1; j<starNum-i; j++){
                sb.append(" ");
            }
            for (k = 0; k<starNum-j+1; k++){
                sb.append("*");
            }
            bw.write(String.valueOf(sb));
            bw.newLine();
            sb.setLength(0);
        }
        bw.flush();
    }
}
