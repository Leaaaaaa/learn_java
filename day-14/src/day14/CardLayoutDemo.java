package day14;/* *
@author Lea
@date 2019/10/9 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CardLayoutDemo implements ItemListener {
    JPanel cards;
    final static String BUTTONPANEL = "JPanel with JButtons";
    final static String TEXTPANEL = "JPanel whith JTextField";

    public void addComponentToPane(Container pane){
        //将JComboxBox放进JPanel
        JPanel comboxBoxPane = new JPanel(); //默认使用FlowLayout
        String comboxBoxItems[] = {BUTTONPANEL, TEXTPANEL};
        JComboBox cb = new JComboBox(comboxBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboxBoxPane.add(cb);

        JPanel card1 = new JPanel();
        card1.add(new JButton("button 1"));
        card1.add(new JButton("button 2"));
        card1.add(new JButton("button 3"));

        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextFiled", 20));

        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTONPANEL);
        cards.add(card2, TEXTPANEL);

        pane.add(comboxBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);


    }

    public void itemStateChanged(ItemEvent evt){
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("CardLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CardLayoutDemo demo = new CardLayoutDemo();
        demo.addComponentToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
