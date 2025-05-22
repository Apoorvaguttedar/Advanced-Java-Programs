/*Write a Java program to insert the specified element at the end of a linked list.
( using  l_listobj.offerLast("Pink")) */


package JavaCollection;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        list.offerLast("Pink");

        System.out.println("List after inserting 'Pink' at the end:");
        System.out.println(list);
    }
}
