package day13;/* *
@author Lea
@date 2019/10/8 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.util.jar.JarEntry;

public class SwingApplication {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Swing Application");
        Container contentPane = f.getContentPane();
        contentPane.setLayout(new GridLayout(3,2));
        JButton button = new JButton("Click me");
        final JLabel label = new JLabel();
        contentPane.add(button); //添加按钮
        contentPane.add(label); //添加标签
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String information = JOptionPane.showInputDialog("请输入一串字符");
                label.setText(information);

            }
        });
        f.setSize(300, 200);
        f.show();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
