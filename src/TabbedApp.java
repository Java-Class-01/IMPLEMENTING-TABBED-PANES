import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedApp {
    JFrame mainFrame;
    JTabbedPane mainTabbedPane;
    Component userInfoTab;
    Component taskTab;

    JTextField nameField;
    JLabel welcomeLabel;
    JButton submitButton;

    public TabbedApp() {
        this.prepareMainFrame();
    }
    public JFrame prepareMainFrame() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        mainFrame = new JFrame("Tabbed Interface Application");

        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); // full screen
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(this.prepareTabbedPane());
        mainFrame.setVisible(true);
        return mainFrame;
    }
    public JTabbedPane prepareTabbedPane() {
        mainTabbedPane = new JTabbedPane();

        userInfoTab = this.prepareUserInfoTab();
        taskTab = this.prepareTaskTab();

        mainTabbedPane.add("User Info", userInfoTab);
        mainTabbedPane.add("Task", taskTab);

        mainTabbedPane.addTab("interact tab",this.preparePanelOne());
        mainTabbedPane.addTab("activity tab",this.preparePanelTwo());

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
    public JPanel prepareTaskTab() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("task Settings"));

        JCheckBox PartOne = new JCheckBox("Logic");
        JCheckBox PartTwo = new JCheckBox("Test");
        JCheckBox PartThree = new JCheckBox("Documentation");

        panel.add(PartOne);
        panel.add(Box.createVerticalStrut(10));
        panel.add(PartTwo);
        panel.add(Box.createVerticalStrut(10));
        panel.add(PartThree);

        return panel;
    }

    public JPanel prepareNamePanel(){
        JPanel Namepanel=new JPanel();
        nameField=new JTextField(15);
        welcomeLabel=new JLabel("");
        submitButton=new JButton("submit");
        JLabel yournameL=new JLabel("enter your name");
        Namepanel.add(yournameL);
        Namepanel.add(nameField,welcomeLabel);
        Namepanel.add(submitButton);

        return Namepanel;
    }

    public JPanel preparePanelOne(){
        JPanel panelOne=new JPanel();

        panelOne.add(this.prepareNamePanel());


        return panelOne;
    }

    public JPanel preparePanelTwo(){
        JPanel panelTwo=new JPanel();
        //panelTwo.add(new JLabel("panel two"));
        panelTwo.setLayout(new GridLayout(4,2,5,5));
        JLabel label=new JLabel("enter your number to be added");
        JTextField text=new JTextField();
        JLabel labeltwo=new JLabel("enter your second number to add on the first");
        JTextField textTwo=new JTextField();
        JButton plusButton=new JButton("add your numbers");
        JLabel resultLabel=new JLabel("here are your results");
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double num1=Double.parseDouble(text.getText());
                    double num2=Double.parseDouble(textTwo.getText());
                    double sum=num1+num2;
                    resultLabel.setText("result is "+sum);
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(panelTwo,"enter number");
                }

            }
        });
        panelTwo.add(label);
        panelTwo.add(text);
        panelTwo.add(labeltwo);
        panelTwo.add(textTwo);
        panelTwo.add(plusButton);
        panelTwo.add(resultLabel);

        return panelTwo;
    }

}
