package day14;/* *
@author Lea
@date 2019/10/9 
*/

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ImplementMouseListener implements MouseListener {
    JFrame f;
    public ImplementMouseListener(){
        f = new JFrame();
        f.setSize(300, 150);
        f.setVisible(true);
          f.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void mousePressed(MouseEvent  e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){
        f.setTitle("点击坐标为（" + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new ImplementMouseListener();
    }
}
