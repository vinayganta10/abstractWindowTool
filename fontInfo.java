package AbstractWindowTool;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class fontInfo extends Frame{
    fontInfo(){
        super("Font demo");
        setSize(300,300);
        setVisible(true);
        setLayout(null);
    }
    public void paint(Graphics g){
        Font f = g.getFont();
        String fontName = f.getName();
        String fontFamily = f.getFamily();
        int fontSize = f.getSize();
        int fontStyle = f.getStyle();
        String msg = "Family: " + fontName;
        msg += ", Font: " + fontFamily;
        msg += ", Size: " + fontSize + ", Style: ";
        if(fontStyle  == Font.BOLD)
            msg += "Bold ";
        if(fontStyle == Font.ITALIC)
            msg += "Italic ";
        if(fontStyle == Font.PLAIN)
            msg += "Plain ";
        g.drawString(msg,100,200);
        msg = f.toString();
        g.drawString(msg,100,100);
    }

    public static void main(String[] args) {
        new fontInfo();
    }
}
