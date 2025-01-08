package LaptopPractice.LaptopBaekjoon;

import java.io.*;
import java.util.ArrayList;

public class Q5597 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int goodStudent = 0;

        ArrayList<Integer> totalStudentNumber = new ArrayList<>();

        for (int i = 1; i < 31; i++){
            totalStudentNumber.add(i);
        }


        ArrayList<Integer> badStudent = new ArrayList<>(totalStudentNumber);

        for(int j = 1; j<29; j++) {
            goodStudent = Integer.parseInt(br.readLine());
            if (totalStudentNumber.contains(goodStudent)){
                badStudent.remove(Integer.valueOf(goodStudent));
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < badStudent.size(); i++){
            writer.write(badStudent.get(i) + "\n");
        }
        writer.flush();

    }
}
