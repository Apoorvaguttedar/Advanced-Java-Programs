package JavaCollection;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalList {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Capital List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setLayout(new BorderLayout());

        // Countries array
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Map country -> capital
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Pretoria (South Africa)"); // Africa is a continent; picked South Africa's capital as example
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList with countries
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Scroll pane for list
        JScrollPane scrollPane = new JScrollPane(countryList);
        frame.add(scrollPane, BorderLayout.CENTER);

        // List selection listener to print capitals on selection
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected countries and their capitals:");
                    for (String country : selectedCountries) {
                        String capital = capitals.get(country);
                        if (capital != null) {
                            System.out.println(country + " -> " + capital);
                        } else {
                            System.out.println(country + " -> Capital not found");
                        }
                    }
                    System.out.println("------------------------");
                }
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
