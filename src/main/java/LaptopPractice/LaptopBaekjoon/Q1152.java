package LaptopPractice.LaptopBaekjoon;

import java.io.*;

public class Q1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // trim removes unnecessary spaces at the beginning and end
        // \\s+ ensures that multiple consecutive spaces are treated as a single delimiter
        String[] words = br.readLine().trim().split("\\s+");

        if(words.length == 1 && words[0].isEmpty()){
            bw.write("0");
        } else {
            bw.write(String.valueOf(words.length));
        }

        bw.flush();

    }
}
