package JavaCollection;

public class StringOperations {

    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "Hello World";

        System.out.println("1. String Creation and Basic Operations:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        // 2. Length and Character Access
        System.out.println("\n2. Length and Character Access:");
        System.out.println("Length of str3: " + str3.length());
        System.out.println("Character at index 4 of str3: " + str3.charAt(4));

        // 3. String Comparison
        System.out.println("\n3. String Comparison:");
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase \"hello\"? " + str1.equalsIgnoreCase("hello"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        System.out.println("\n4. String Searching:");
        System.out.println("str3 contains \"World\"? " + str3.contains("World"));
        System.out.println("Index of 'o' in str3: " + str3.indexOf('o'));
        System.out.println("Last index of 'l' in str3: " + str3.lastIndexOf('l'));

        // 5. Substring Operations
        System.out.println("\n5. Substring Operations:");
        System.out.println("Substring of str3 from index 6: " + str3.substring(6));
        System.out.println("Substring of str3 from index 0 to 5: " + str3.substring(0, 5));

        // 6. String Modification
        System.out.println("\n6. String Modification:");
        System.out.println("Replace \"World\" with \"Java\": " + str3.replace("World", "Java"));
        System.out.println("To Upper Case: " + str3.toUpperCase());
        System.out.println("To Lower Case: " + str3.toLowerCase());

        // 7. Whitespace Handling
        String strWithSpaces = "  Hello Java  ";
        System.out.println("\n7. Whitespace Handling:");
        System.out.println("Original: '" + strWithSpaces + "'");
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        System.out.println("\n8. String Concatenation:");
        System.out.println("Using + operator: " + str1 + " " + str2);
        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

        // 9. String Splitting
        System.out.println("\n9. String Splitting:");
        String csv = "Apple,Banana,Cherry,Date";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        System.out.println("\n10. StringBuilder Demo:");
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("StringBuilder content: " + sb.toString());

        // 11. String Formatting
        System.out.println("\n11. String Formatting:");
        String name = "Alice";
        int age = 28;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // 12. Validate Email with contains(), startsWith(), endsWith()
        System.out.println("\n12. Email Validation:");
        String email = "alice@example.com";
        boolean isValid = email.contains("@") && email.startsWith("alice") && email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println("Is valid? " + isValid);
    }
}
