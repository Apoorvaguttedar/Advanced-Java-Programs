package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorSortDemo {
    public static void main(String[] args) {
        // Create an ArrayList to hold color names
        List<String> colors = new ArrayList<>();

        // Add different colors
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");

        // Display original list
        System.out.println("Original colors: " + colors);

        // Sort the list using Collections.sort()
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted colors: " + colors);
    }
}
