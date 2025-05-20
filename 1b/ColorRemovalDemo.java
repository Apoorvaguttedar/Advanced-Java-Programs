package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ColorRemovalDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of colors
        List<String> colors = new ArrayList<>();

        // Adding different colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original colors: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedByIndex = colors.remove(1);
            System.out.println("Removed 2nd element (index 1): " + removedByIndex);
        } else {
            System.out.println("List has less than 2 elements, cannot remove index 1.");
        }

        // Remove the color "Blue" (in case it's still in the list)
        boolean removedByValue = colors.remove("Blue");
        if (removedByValue) {
            System.out.println("Removed color 'Blue' from the list.");
        } else {
            System.out.println("Color 'Blue' was not found in the list.");
        }

        // Display final list
        System.out.println("Updated colors: " + colors);
    }
}
