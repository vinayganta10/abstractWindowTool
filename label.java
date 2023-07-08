package AbstractWindowTool;

import java.awt.*;
import java.awt.event.*;

public class label extends Frame implements MouseListener{
    Label l;
    public label(){
        l = new Label("Welcome to java");
        l.addMouseListener(this);
        add(l);
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        new label();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");
    }
}
