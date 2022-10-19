import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow("Hello World", 1080, 720, JFrame.EXIT_ON_CLOSE, null);
        HashMap<String,String[]> menus = new HashMap<>();
        menus.put("Ecriture", new String[]{"ajouter"});
        window.setMenu(menus);
        window.setVisible(true);
    }
}
