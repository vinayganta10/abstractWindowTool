package AbstractWindowTool;

import java.awt.*;

public class flowLayoutExample extends Frame {
    Button b1,b2,b3,b4,b5;
    flowLayoutExample(){
        b1 = new Button();
        setLayout(new FlowLayout(FlowLayout.RIGHT));
    }
    public static void main(String[] args) {
        new flowLayoutExample();
    }
}
