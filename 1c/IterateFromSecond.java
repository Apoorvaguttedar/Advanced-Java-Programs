package JavaCollection;

import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Black"));

        System.out.println("Iterating from 2nd position (index 1):");
        Iterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
