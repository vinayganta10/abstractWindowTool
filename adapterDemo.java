package AbstractWindowTool;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class adapterDemo extends Frame {
    adapterDemo(){
        super("Adapter demo");
        Label l = new Label("ksdkud");
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l);
        l.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l.setText("clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                l.setText("pressed");
            }

            @Override
            public void mouseEntered(MouseEvent e){
                l.setText("entered");
            }
        });

    }
    public static void main(String[] args) {
        new adapterDemo();
    }
}
