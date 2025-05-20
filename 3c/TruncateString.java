package JavaCollection;

import java.util.Scanner;

public class TruncateString {

    public static String truncate(String str, int length) {
        if (str == null || length < 0) return str;
        if (str.length() <= length) return str;
        if (length <= 3) return str.substring(0, length); // No space for "..."
        return str.substring(0, length - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to truncate: ");
        String input = sc.nextLine();

        System.out.print("Enter max length: ");
        int length = sc.nextInt();

        String truncated = truncate(input, length);
        System.out.println("Truncated string: " + truncated);
        sc.close();
    }
}
