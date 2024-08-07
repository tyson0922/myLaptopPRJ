package LaptopPractice.JavaBook;

import javax.swing.*;
import java.awt.*;

public class Code12_02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("레이블");
        frame.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("난생처음~~~ 자바를");
        frame.add(label1);

        JLabel label2 = new JLabel("열심히");
        label2.setForeground(Color.RED);
        Font font = new Font("궁서 보통", Font.BOLD, 30);
        label2.setFont(font);
        frame.add(label2);

        JLabel label3 = new JLabel("코딩 중입니다.");
        label3.setOpaque(true);
        label3.setForeground(Color.YELLOW);
        frame.add(label3);

        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
