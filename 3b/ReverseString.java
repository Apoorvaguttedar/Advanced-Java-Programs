package JavaCollection;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
