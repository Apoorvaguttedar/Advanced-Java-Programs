package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ColorSearchDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of colors
        List<String> colors = new ArrayList<>();

        // Adding different colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");

        // Display the list of colors
        System.out.println("Available colors: " + colors);

        // Search for the color "Red"
        String searchColor = "Red";
        if (colors.contains(searchColor)) {
            System.out.println("The color '" + searchColor + "' is available in the list.");
        } else {
            System.out.println("The color '" + searchColor + "' is NOT available in the list.");
        }
    }
}
