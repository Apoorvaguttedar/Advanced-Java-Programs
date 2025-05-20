package JavaCollection;

import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Black"));

        System.out.println("Iterating in reverse order:");
        Iterator<String> reverseIterator = list.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
