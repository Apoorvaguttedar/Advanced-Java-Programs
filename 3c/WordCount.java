package JavaCollection;

import java.util.Scanner;

public class WordCount {

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to count words: ");
        String input = sc.nextLine();

        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
        sc.close();
    }
}
