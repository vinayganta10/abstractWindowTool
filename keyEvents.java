package AbstractWindowTool;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyEvents extends Frame implements KeyListener {
    keyEvents(){
        addKeyListener(this);
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new keyEvents();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        setBackground(Color.BLUE);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        setBackground(Color.RED);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        setBackground(Color.GREEN);
    }
}
