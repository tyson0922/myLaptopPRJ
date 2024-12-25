package LaptopPractice.LaptopBaekjoon;

import java.io.*;

public class Q15552 {
    public static void main(String[] args) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int i;
            int rowNumber = Integer.parseInt(br.readLine());
            for (i = 0; i<rowNumber; i++) {

                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);

                int result = a + b;
                if (i != rowNumber-1){
                    bw.write(String.valueOf(result));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(result));
                }

            }
            bw.flush();

        } catch (IOException e){
            e.printStackTrace();;
        }
    }
}
