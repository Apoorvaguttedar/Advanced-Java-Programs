package JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColorRemoveByIndexDemo {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        List<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original colors: " + colors);

        // Get user input for index to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index (starting from 0) of the element to remove: ");
        int index = scanner.nextInt();

        // Validate and remove the element
        if (index >= 0 && index < colors.size()) {
            String removedColor = colors.remove(index);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid index. No element removed.");
        }

        // Display updated list
        System.out.println("Updated colors: " + colors);
    }
}
