package JavaCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton srilankaBtn = new JButton("Srilanka");
        JButton indiaBtn = new JButton("India");

        // Create label to display message
        JLabel messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Add action listeners
        srilankaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        indiaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        // Add components to frame
        frame.add(srilankaBtn);
        frame.add(indiaBtn);
        frame.add(messageLabel);

        frame.setLocationRelativeTo(null);  // Center frame
        frame.setVisible(true);
    }
}

