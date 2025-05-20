package JavaCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Load images (Make sure images exist in project folder or provide correct path)
        ImageIcon digitalClockIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

        // Create buttons with images and text
        JButton digitalClockBtn = new JButton("Digital Clock", digitalClockIcon);
        JButton hourGlassBtn = new JButton("Hour Glass", hourGlassIcon);

        // Label to display message and image
        JLabel displayLabel = new JLabel();
        displayLabel.setHorizontalTextPosition(JLabel.CENTER);
        displayLabel.setVerticalTextPosition(JLabel.BOTTOM);
        displayLabel.setFont(new Font("Arial", Font.BOLD, 16));
        displayLabel.setPreferredSize(new Dimension(300, 200));

        // Action Listener for Digital Clock button
        digitalClockBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("Digital Clock is pressed");
                displayLabel.setIcon(digitalClockIcon);
            }
        });

        // Action Listener for Hour Glass button
        hourGlassBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("Hour Glass is pressed");
                displayLabel.setIcon(hourGlassIcon);
            }
        });

        // Add components to frame
        frame.add(digitalClockBtn);
        frame.add(hourGlassBtn);
        frame.add(displayLabel);

        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
