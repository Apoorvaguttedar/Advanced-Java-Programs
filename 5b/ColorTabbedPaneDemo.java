package JavaCollection;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPaneDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color TabbedPane Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each color tab
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        // Initially set their backgrounds (optional)
        redPanel.setBackground(Color.RED);
        bluePanel.setBackground(Color.BLUE);
        greenPanel.setBackground(Color.GREEN);

        // Add tabs to tabbedPane with empty panels (color changes on selection)
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add change listener to update background color dynamically
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                switch (selectedIndex) {
                    case 0: // RED tab
                        redPanel.setBackground(Color.RED);
                        break;
                    case 1: // BLUE tab
                        bluePanel.setBackground(Color.BLUE);
                        break;
                    case 2: // GREEN tab
                        greenPanel.setBackground(Color.GREEN);
                        break;
                }
            }
        });

        // Add tabbed pane to frame
        frame.add(tabbedPane);

        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
