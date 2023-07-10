package AbstractWindowTool;

import java.awt.*;
import java.awt.event.*;


public class textField extends Frame implements ActionListener{
    TextField tf,tf1,tf2;
    Button b1,b2;

    public textField(){
        tf = new TextField(20);
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        b1 = new Button("+");
        b2 = new Button("-");
        tf2.setEditable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(tf);add(tf1);add(tf2);
        add(b1);add(b2);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new textField();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf.getText();
        String s2 = tf1.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        if(e.getSource() == b1){
            int c = a+b;
            tf2.setText(""+c);
        }
        else if(e.getSource() == b2){
            int c= a-b;
            tf2.setText(""+c);
        }
    }

}
