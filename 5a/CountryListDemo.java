package JavaCollection;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Country List Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList with countries and allow multiple selection
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Add listener to detect selection changes
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Get selected values
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected countries:");
                    for (String country : selectedCountries) {
                        System.out.println(country);
                    }
                    System.out.println("----------------------");
                }
            }
        });

        frame.setLocationRelativeTo(null); // Center window
        frame.setVisible(true);
    }
}

