package day14;/* *
@author Lea
@date 2019/10/9 
*/

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExtendMouseAdapter extends MouseAdapter {
    JFrame f ;
    public ExtendMouseAdapter(){
        f = new JFrame();
        f.setSize(300,150);
        f.setVisible(true);
        f.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    public void mouseClicked(MouseEvent e){
        f.setTitle("点击坐标为" + e.getX() + " , " + e.getY() );
    }
    public static void main(String[] args) {
        new ExtendMouseAdapter();
    }
}
