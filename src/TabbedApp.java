import javax.swing.*;
import java.awt.*;

public class TabbedApp {
    JFrame mainFrame;
    JTabbedPane mainTabbedPane;
    Component userInfoTab;
    Component taskTab;

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
    public JTabbedPane prepareTabbedPane() {
        mainTabbedPane = new JTabbedPane();

        userInfoTab = this.prepareUserInfoTab();
        taskTab = this.prepareTaskTab();

        mainTabbedPane.add("User Info", userInfoTab);
        mainTabbedPane.add("Task", taskTab);

        return mainTabbedPane;
    }
    public JPanel prepareUserInfoTab() {
        JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
        panel.setBorder(BorderFactory.createTitledBorder("User Information"));

        panel.add(new JLabel("Name:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Email:"));
        panel.add(new JTextField());
        return panel;
    }

}
