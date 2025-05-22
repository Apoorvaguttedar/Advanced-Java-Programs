/*Write a Java program to iterate through all elements in a linked list starting at the  specified position ( 2nd) using iterator 
( hint : Iterator iteratorobj = listobj.listIterator(1)) */



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
