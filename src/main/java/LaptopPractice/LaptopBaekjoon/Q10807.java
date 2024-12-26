package LaptopPractice.LaptopBaekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String firstRow = bufferedReader.readLine();
        int n = Integer.parseInt(firstRow);

        String[] secondRow = bufferedReader.readLine().split(" ");

        int[] numberArray = new int[n];

        String thirdRow = bufferedReader.readLine();
        int v = Integer.parseInt(thirdRow);

        int count = 0;
        for (int i = 0; i <n; i++){
            numberArray[i] = Integer.parseInt(secondRow[i]);
            if (numberArray[i] == v){
                count++;
            }
        }

        System.out.println(count);
    }
}
