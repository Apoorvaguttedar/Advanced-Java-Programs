package JavaCollection;

import java.util.Scanner;

public class CapitalizeWords {

    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        String[] words = str.split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase());
                }
                capitalized.append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = capitalizeWords(input);
        System.out.println("Capitalized: " + result);
        sc.close();
    }
}
