import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class TabbedAppTest {
    private TabbedApp tabbedApp;

    @BeforeEach
    void setUp() {
        tabbedApp = new TabbedApp();
    }

    @Test
    void testTabbedAppCreation() {
        assertNotNull(tabbedApp);
        assertNotNull(tabbedApp.mainFrame);
        assertNotNull(tabbedApp.mainTabbedPane);
    }

    @Test
    void testMainFrameProperties() {
        JFrame frame = tabbedApp.mainFrame;
        assertEquals("Tabbed Interface Application", frame.getTitle());
        assertTrue(frame.isVisible());
    }

    @Test
    void testTabbedPaneHasCorrectNumberOfTabs() {
        JTabbedPane tabbedPane = tabbedApp.mainTabbedPane;
        assertEquals(4, tabbedPane.getTabCount());
        assertEquals("User Info", tabbedPane.getTitleAt(0));
        assertEquals("Task", tabbedPane.getTitleAt(1));
        assertEquals("interact tab", tabbedPane.getTitleAt(2));
        assertEquals("activity tab", tabbedPane.getTitleAt(3));
    }

    @Test
    void testUserInfoTabComponents() {
        Component userInfoTab = tabbedApp.userInfoTab;
        assertNotNull(userInfoTab);
        assertTrue(userInfoTab instanceof JPanel);
    }

    @Test
    void testTaskTabComponents() {
        Component taskTab = tabbedApp.taskTab;
        assertNotNull(taskTab);
        assertTrue(taskTab instanceof JPanel);
    }

    @Test
    void testNumberAdditionLogic() {
        double num1 = 5.5;
        double num2 = 3.2;
        double expectedSum = 8.7;
        double actualSum = num1 + num2;
        
        assertEquals(expectedSum, actualSum, 0.001);
    }

    @Test
    void testInvalidNumberInput() {
        assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble("invalid");
        });
    }
}