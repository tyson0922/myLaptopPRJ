package LaptopPractice.JavaBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Code12_03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("버튼");
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton("클릭하세요");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "버튼을 눌렀군요 ^^");
            }
        });
        frame.add(button1);

        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
