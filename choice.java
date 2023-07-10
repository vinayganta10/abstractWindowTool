package AbstractWindowTool;

import java.awt.*;
import java.awt.event.*;

public class choice extends Frame implements ItemListener,ActionListener{
    private Choice c;
    private Button b;
    private Label l;
    private String s;
    public choice(){
        c = new Choice();
        b = new Button("Submit");
        l = new Label();
        c.add("JAVA");
        c.add("C++");
        c.add("C#");
        c.add("PHP");
        c.addItemListener(this);
        b.addActionListener(this);
        add(l);add(c);add(b);
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        l.setText(s);
    }
    public void itemStateChanged(ItemEvent ie){
        s = c.getSelectedItem();
    }
    public static void main(String[] args) {
        new choice();
    }
}


