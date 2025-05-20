package JavaCollection;

import javax.swing.*;
import java.awt.*;

public class HelloSwing {

    public static void main(String[] args) {
        // Create the JFrame window
        JFrame frame = new JFrame("Swing Hello Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 150);  // Set window size

        // Create JLabel with the message
        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font: Plain, size 32
        label.setFont(new Font("Serif", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to the frame
        frame.add(label);

        // Center the window on screen
        frame.setLocationRelativeTo(null);

        // Make frame visible
        frame.setVisible(true);
    }
}
