package JavaCollection;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CMYTabbedPaneDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CMY TabbedPane Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each color tab
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        // Set initial background colors (optional)
        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs with panels
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Change listener to update color when tab is selected
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                switch (selectedIndex) {
                    case 0:
                        cyanPanel.setBackground(Color.CYAN);
                        break;
                    case 1:
                        magentaPanel.setBackground(Color.MAGENTA);
                        break;
                    case 2:
                        yellowPanel.setBackground(Color.YELLOW);
                        break;
                }
            }
        });

        frame.add(tabbedPane);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
