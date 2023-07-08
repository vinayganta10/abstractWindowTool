package AbstractWindowTool;

import java.awt.*;
import java.awt.event.*;

public class mouseEvents extends Frame implements MouseListener,MouseMotionListener,MouseWheelListener {
    public mouseEvents(){
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new mouseEvents();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setBackground(Color.BLACK);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setBackground(Color.GREEN);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.CYAN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.RED);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        setBackground(Color.YELLOW);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        setBackground(Color.WHITE);
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        setBackground(Color.ORANGE);
    }
}
