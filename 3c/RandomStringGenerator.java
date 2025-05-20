package JavaCollection;

import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int length) {
        if (length <= 0) return "";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int idx = random.nextInt(CHAR_POOL.length());
            sb.append(CHAR_POOL.charAt(idx));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of random string: ");
        int length = sc.nextInt();

        String randomStr = generateRandomString(length);
        System.out.println("Random String: " + randomStr);
        sc.close();
    }
}
