package AbstractWindowTool;

import java.awt.*;

public class MenuExample extends Frame{
    MenuExample(){
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("File",true);
        Menu submenu = new Menu("OpenRecent");
        MenuItem m1 = new MenuItem("Open");
        MenuItem m2 = new MenuItem("New");
        MenuItem m3 = new MenuItem("Exit");
        MenuItem m4 = new MenuItem("Project");
        MenuItem m5 = new MenuItem("Vinay");
        menu.add(m1);
        menu.addSeparator();
        menu.add(m2);
        menu.addSeparator();
        menu.add(m3);
        menu.addSeparator();
        //menu.add("hey");//adding label
        submenu.add(m4);
        submenu.addSeparator();
        submenu.add(m5);
        menu.add(submenu);
        mb.add(menu);
        setMenuBar(mb);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MenuExample();
    }
}
