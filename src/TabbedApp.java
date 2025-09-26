import javax.swing.*;
import java.awt.*;

public class TabbedApp {
    JFrame mainFrame;
    public TabbedApp() {
        this.prepareMainFrame();
    }
    public JFrame prepareMainFrame() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        mainFrame = new JFrame("Tabbed Interface Application");

        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); // full screen
        mainFrame.setLayout(new BorderLayout());

        mainFrame.setVisible(true);
        return mainFrame;
    }

}
