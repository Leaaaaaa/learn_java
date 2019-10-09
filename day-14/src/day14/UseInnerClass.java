package day14;/* *
@author Lea
@date 2019/10/9 
*/

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UseInnerClass {
    JFrame f;
    public UseInnerClass(){
        f = new JFrame();
        f.setSize(300, 300);
        f.setVisible(true);
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                f.setTitle("点击坐标为" + e.getX() + " , " +e.getY());
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UseInnerClass();
    }
}
