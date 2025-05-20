package JavaCollection;

import java.util.*;

public class ListOperationsDemo {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("===== ArrayList Operations =====");
        performOperations(arrayList);

        System.out.println("\n===== LinkedList Operations =====");
        performOperations(linkedList);
    }

    public static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("1. Added elements: " + list);

        // 2. Adding element at specific index
        list.add(1, "Mango");
        System.out.println("2. After adding 'Mango' at index 1: " + list);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        list.addAll(moreFruits);
        System.out.println("3. After adding multiple elements: " + list);

        // 4. Accessing elements
        System.out.println("4. Element at index 2: " + list.get(2));

        // 5. Updating elements
        list.set(0, "Strawberry");
        System.out.println("5. After updating index 0 to 'Strawberry': " + list);

        // 6. Removing elements
        list.remove("Banana");
        list.remove(2);
        System.out.println("6. After removing 'Banana' and element at index 2: " + list);

        // 7. Searching elements
        System.out.println("7. Contains 'Apple'? " + list.contains("Apple"));
        System.out.println("7. Index of 'Mango': " + list.indexOf("Mango"));

        // 8. List size
        System.out.println("8. Size of list: " + list.size());

        // 9. Iterating over list (for-each)
        System.out.print("9. Iterating using for-each: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("10. Iterating using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("11. Sorted list: " + list);

        // 12. Sublist
        List<String> subList = list.subList(1, list.size());
        System.out.println("12. Sublist from index 1 to end: " + subList);

        // 13. Clearing the list
        list.clear();
        System.out.println("13. List after clearing: " + list);
    }
}
