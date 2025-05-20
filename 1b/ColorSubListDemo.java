package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ColorSubListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        List<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");     // Index 0
        colors.add("Blue");    // Index 1
        colors.add("Green");   // Index 2
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original colors: " + colors);

        // Extract 1st and 2nd elements using subList (index 0 to 2 exclusive)
        if (colors.size() >= 2) {
            List<String> subList = colors.subList(0, 2);
            System.out.println("Extracted 1st and 2nd elements: " + subList);
        } else {
            System.out.println("Not enough elements to extract a sublist of first two.");
        }
    }
}
