package AbstractWindowTool;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button extends Frame implements ActionListener{
    TextField tf;
    Button b;
    button(){
        super("button demo");
        tf = new TextField(20);
        b = new Button("Submit");
        b.addActionListener(this);
        add(b);
        add(tf);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        tf.setText("Submitted");
    }
    public static void main(String[] args) {
        button b1 = new button();
    }
}
