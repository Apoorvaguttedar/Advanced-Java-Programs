/*Write a Java program that swaps two elements ( first and third elements ) in a linked 
list ( using Collections.swap(l_list, 0, 2)) */


package JavaCollection;

import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        Collections.swap(list, 0, 2); // Swap first and third (index 0 and 2)

        System.out.println("List after swapping first and third elements:");
        System.out.println(list);
    }
}

