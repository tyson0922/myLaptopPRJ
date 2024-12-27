package LaptopPractice.LaptopBaekjoon;

import java.io.*;
import java.util.ArrayList;

public class Q10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstRow =bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(firstRow[0]);
        int x = Integer.parseInt(firstRow[1]);
        int i;

        String[] secondRow = bufferedReader.readLine().split(" ");
        ArrayList<Integer> numberArray = new ArrayList<>();

        for (i = 0; i < n; i ++){
            if (Integer.parseInt(secondRow[i]) < x){
                numberArray.add(Integer.parseInt(secondRow[i]));
            }
        }

        for(int j = 0; j < numberArray.size(); j ++){
            bufferedWriter.write(numberArray.get(j) + " ");
        }
        bufferedWriter.flush();

    }
}
