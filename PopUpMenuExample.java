package AbstractWindowTool;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopUpMenuExample{
    Frame f;
    public PopUpMenuExample(){
        f = new Frame("PopupMenu");
        PopupMenu pm = new PopupMenu("File");
        MenuItem m1 = new MenuItem("Copy");
        m1.setActionCommand("Copy");
        MenuItem m2 = new MenuItem("cut");
        m2.setActionCommand("cut");
        MenuItem m3 = new MenuItem("paste");
        m3.setActionCommand("paste");
        pm.add(m1);
        pm.add(m2);
        pm.add(m3);
        f.add(pm);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400,400);
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pm.show(f,e.getX(),e.getY());
            }
        });
    }
    public static void main(String[] args) {
        new PopUpMenuExample();
    }
}
