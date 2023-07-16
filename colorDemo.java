package AbstractWindowTool;

import java.awt.*;
import java.awt.Frame;

public class colorDemo extends Frame{
    colorDemo(){
        super("Font demo");
        setSize(300,300);
        setVisible(true);
        setLayout(null);
    }
    public void paint(Graphics g){
            Color c1 = new Color(255, 100, 100);
            Color c2 = new Color(0, 255, 0);
            Color c3 = new Color(100, 100, 255);
            g.setColor(c1);
            g.drawLine(0, 0, 100, 100);
            g.setColor(c2);
            g.drawLine(0, 90, 400, 400);

            g.setColor(Color.red);
            g.drawOval(10, 10, 50, 50);
            g.fillOval(70, 90, 140, 100);

            g.setColor(Color.blue);
            g.drawOval(190, 10, 90, 30);


            g.setColor(Color.cyan);
            g.fillRect(100, 10, 60, 50);
    }
    public static void main(String[] args) {
        new colorDemo();
    }
}
