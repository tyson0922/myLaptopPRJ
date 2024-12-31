package LaptopPractice.LaptopBaekjoon;

import java.io.*;

public class Q2738 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstRow = br.readLine().split(" ");

        int rowNum = Integer.parseInt(firstRow[0]);
        int columnNum = Integer.parseInt(firstRow[1]);

        int[][] arrayA = new int[rowNum][columnNum];
        int[][] arrayB = new int[rowNum][columnNum];

        for (int i = 0; i < rowNum * 2; i++) {

            String[] arrayRow = br.readLine().split(" ");

            for (int j = 0; j < columnNum; j++) {

                if (i < rowNum) {
                    arrayA[i][j] = Integer.parseInt(arrayRow[j]);
                } else {
                    arrayB[i - rowNum][j] = Integer.parseInt(arrayRow[j]);
                }

            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] resultArray = new int[rowNum][columnNum];
        for (int i = 0; i<rowNum; i++){
            for (int j = 0; j<columnNum; j++){
                resultArray[i][j] = arrayA[i][j] + arrayB[i][j];
                writer.write(resultArray[i][j] + " ");
            }
            writer.write("\n");
        }

        writer.flush();

    }
}
