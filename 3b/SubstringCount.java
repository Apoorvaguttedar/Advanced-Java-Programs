package JavaCollection;

import java.util.Scanner;

public class SubstringCount {

    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter the substring to count: ");
        String subStr = sc.nextLine();

        int occurrences = countOccurrences(mainStr, subStr);
        System.out.println("Occurrences of \"" + subStr + "\": " + occurrences);
        sc.close();
    }
}

