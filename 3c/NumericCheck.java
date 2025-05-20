package JavaCollection;

import java.util.Scanner;

public class NumericCheck {

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        return str.matches("\\d+");  // One or more digits only
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if numeric: ");
        String input = sc.nextLine();

        boolean numeric = isNumeric(input);
        System.out.println("Is numeric? " + numeric);
        sc.close();
    }
}
