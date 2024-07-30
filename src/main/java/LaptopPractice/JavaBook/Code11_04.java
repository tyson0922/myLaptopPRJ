package LaptopPractice.JavaBook;

import java.io.FileWriter;
import java.io.IOException;

public class Code11_04 {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("C:/firstJava/myData2.txt");
        String outStr;

        outStr = "르세라핌과 죠스";
        fw.write(outStr + "\n");
        outStr = "아이브";
        fw.write(outStr + "\n");

        fw.close();
        System.out.println(" --myData2.txt 파일이 저장됨");
    }
}
