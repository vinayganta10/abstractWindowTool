package AbstractWindowTool;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class textArea extends Frame {
    textArea(){
        TextField tf = new TextField(20);
        TextArea ta = new TextArea();
        ta.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                tf.setText(ta.getText());
            }
        });
        add(ta);
        add(tf);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new textArea();
    }
}
