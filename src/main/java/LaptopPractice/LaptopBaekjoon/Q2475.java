package LaptopPractice.LaptopBaekjoon;

import java.io.*;

public class Q2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstRow = br.readLine().split(" ");

        int result;
        result = 0;
        int num;
        for(int i =0; i<5; i++){
            num = Integer.parseInt(firstRow[i]);
            result += (int) Math.pow(num,2);
        }
        result = result % 10;

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
