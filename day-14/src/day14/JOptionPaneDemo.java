package day14;/* *
@author Lea
@date 2019/10/9 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneDemo extends JFrame implements ActionListener {
    public JOptionPaneDemo(){
        super("简单对话框");
        Container c = getContentPane();
        JButton button = new JButton("退出");
        button.addActionListener(this);
        c.setLayout(new FlowLayout());
        c.add(button);
    }

    public void actionPerformed(ActionEvent e){
        //弹出对话框，并用变量select记录用户的选择
        int select = JOptionPane.showConfirmDialog(this, "确定要做出选择吗？",
                "确认", JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE
                );
        //如果用户选择"确定,就退出程序
        if(select == JOptionPane.OK_CANCEL_OPTION)
            System.exit(0);
    }

    public static void main(String[] args) {
        JFrame frame = new JOptionPaneDemo();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
