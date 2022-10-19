import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MainWindow extends JFrame {
    private JMenuBar menuBar;

    public MainWindow(String title, int width, int height, int closingOperation, LayoutManager manager) {
        super(title);
        this.setDefaultCloseOperation(closingOperation);
        this.setSize(width, height);
        this.setLayout(manager);

        menuBar = new JMenuBar();
    }

    public void setMenu(HashMap<String,String[]> menus) {
        for (Map.Entry<String,String[]> menuElement : menus.entrySet()) {
            JMenu menu = new JMenu(menuElement.getKey());
            for (String menuItem : menuElement.getValue()) {
                menu.add(new JMenuItem(menuItem));
            }
            menuBar.add(menu);
        }

        this.setJMenuBar(menuBar);
    }
}
