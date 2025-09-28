import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

class TabbedAppTest {
        @Test
        void TestingMainFrame(){
            TabbedApp app = new TabbedApp();

            Assertions.assertEquals("Tabbed Interface Application", app.prepareMainFrame().getTitle());
            Assertions.assertEquals(true, app.prepareMainFrame().isVisible());
            Assertions.assertEquals(JFrame.MAXIMIZED_BOTH, app.prepareMainFrame().getExtendedState());
            Assertions.assertEquals(true, app.prepareMainFrame().getLayout() instanceof BorderLayout);
            Assertions.assertEquals(true, app.prepareMainFrame().getContentPane().getComponent(0) instanceof JTabbedPane);
      }
      @Test
       void TestingTabbedPane() {
            TabbedApp app = new TabbedApp();

            Assertions.assertEquals(true, app.prepareTabbedPane() != null);
            Assertions.assertEquals(4, app.prepareTabbedPane().getTabCount());
            Assertions.assertEquals("User Info", app.prepareTabbedPane().getTitleAt(0));
            Assertions.assertEquals("Task", app.prepareTabbedPane().getTitleAt(1));
            Assertions.assertEquals("interact tab", app.prepareTabbedPane().getTitleAt(2));
            Assertions.assertEquals("activity tab", app.prepareTabbedPane().getTitleAt(3));
            Assertions.assertEquals(true, app.prepareTabbedPane().getComponentAt(0) instanceof JPanel);
            Assertions.assertEquals(true, app.prepareTabbedPane().getComponentAt(1) instanceof JPanel);
            Assertions.assertEquals(true, app.prepareTabbedPane().getComponentAt(2) instanceof JPanel);
            Assertions.assertEquals(true, app.prepareTabbedPane().getComponentAt(3) instanceof JPanel);
       }
       @Test
        void TestingUserInfoTab() {
           TabbedApp app = new TabbedApp();

           JPanel panel = app.prepareTaskTab();

           Assertions.assertEquals(true, panel.getLayout() instanceof BoxLayout);
           Assertions.assertEquals("task Settings", ((javax.swing.border.TitledBorder) panel.getBorder()).getTitle());
           Assertions.assertEquals(5, panel.getComponentCount());
           Assertions.assertEquals("Logic", ((JCheckBox) panel.getComponent(0)).getText());
           Assertions.assertEquals(true, panel.getComponent(1) instanceof Box.Filler);
           Assertions.assertEquals("Test", ((JCheckBox) panel.getComponent(2)).getText());
           Assertions.assertEquals(true, panel.getComponent(3) instanceof Box.Filler);
           Assertions.assertEquals("Documentation", ((JCheckBox) panel.getComponent(4)).getText());
            }

       @Test
         void TestingUserJpanel1() {    TabbedApp app = new TabbedApp();

        JPanel panel = app.prepareTaskTab();

        Assertions.assertEquals(true, panel.getLayout() instanceof BoxLayout);
        BoxLayout layout = (BoxLayout) panel.getLayout();
        Assertions.assertEquals(BoxLayout.Y_AXIS, layout.getAxis());
        Assertions.assertEquals("task Settings", ((javax.swing.border.TitledBorder) panel.getBorder()).getTitle());
        Assertions.assertEquals(5, panel.getComponentCount());
        Assertions.assertEquals("Logic", ((JCheckBox) panel.getComponent(0)).getText());
        Assertions.assertEquals(true, panel.getComponent(1) instanceof Box.Filler);
        Assertions.assertEquals("Test", ((JCheckBox) panel.getComponent(2)).getText());
        Assertions.assertEquals(true, panel.getComponent(3) instanceof Box.Filler);
        Assertions.assertEquals("Documentation", ((JCheckBox) panel.getComponent(4)).getText());
        }


        @Test
         void TestingMainJpanel () {
            TabbedApp app = new TabbedApp();

            JPanel panel = app.prepareNamePanel();

            Assertions.assertEquals(true, panel.getLayout() instanceof FlowLayout);
            Assertions.assertEquals(3, panel.getComponentCount());
            Assertions.assertEquals("enter your name", ((JLabel) panel.getComponent(0)).getText());
            Assertions.assertEquals(true, panel.getComponent(1) instanceof JTextField);
            Assertions.assertEquals(15, ((JTextField) panel.getComponent(1)).getColumns());
            Assertions.assertEquals("submit", ((JButton) panel.getComponent(2)).getText());
        }

    @Test
    void TestingJpanel2() {
        TabbedApp app = new TabbedApp();

        JPanel panelOne = app.preparePanelOne();
        Assertions.assertEquals(true, panelOne != null);
        Assertions.assertEquals(true, panelOne.getLayout() instanceof FlowLayout);
        Assertions.assertEquals(1, panelOne.getComponentCount());
        Assertions.assertEquals(true, panelOne.getComponent(0) instanceof JPanel);
        JPanel inner = (JPanel) panelOne.getComponent(0);
        Assertions.assertEquals(3, inner.getComponentCount()); // label + textfield + button
        Assertions.assertEquals("enter your name", ((JLabel) inner.getComponent(0)).getText());
        Assertions.assertEquals(15, ((JTextField) inner.getComponent(1)).getColumns());
        Assertions.assertEquals("submit", ((JButton) inner.getComponent(2)).getText());
    }
    @Test
     void TestingJPanelTwo() { TabbedApp app = new TabbedApp();

            JPanel panelTwo = app.preparePanelTwo();

            Assertions.assertEquals(true, panelTwo.getLayout() instanceof FlowLayout);
            Assertions.assertEquals(1, panelTwo.getComponentCount());
            Assertions.assertEquals(true, panelTwo.getComponent(0) instanceof JLabel);
            Assertions.assertEquals("panel two", ((JLabel) panelTwo.getComponent(0)).getText());
      }
     }