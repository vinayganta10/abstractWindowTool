package AbstractWindowTool;

import java.awt.*;
import java.awt.event.*;

public class checkBox extends Frame implements ItemListener {
    CheckboxGroup c;
    Checkbox c1,c2,c3,c4;
    Label l;
    public checkBox(){
        l= new Label();
        c =new CheckboxGroup();
        c1 = new Checkbox("java",true,c);
        c2 = new Checkbox("C++",false,c);
        c3 = new Checkbox("PHP",false,c);
        c4 = new Checkbox("C#",false,c);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        add(c1);add(c2);add(c3);add(c4);add(l);
        setLayout(new GridLayout(4,1));
        setSize(20,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new checkBox();
    }
    @Override
    public void itemStateChanged(ItemEvent ie){
        String s = c.getSelectedCheckbox().getLabel();
        l.setText("selected: " + s);
    }
}
