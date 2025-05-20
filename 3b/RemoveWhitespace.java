package JavaCollection;

import java.util.Scanner;

public class RemoveWhitespace {

    public static String removeWhitespace(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to remove whitespace: ");
        String input = sc.nextLine();

        String result = removeWhitespace(input);
        System.out.println("String without whitespace: \"" + result + "\"");
        sc.close();
    }
}

