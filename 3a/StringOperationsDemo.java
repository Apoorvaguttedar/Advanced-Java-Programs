package JavaCollection;

public class StringOperationsDemo {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello World");
        System.out.println("1. String Creation:");
        System.out.println("str1: " + str1 + ", str2: " + str2 + ", str3: " + str3);

        // 2. Length and Character Access
        System.out.println("\n2. Length and Character Access:");
        System.out.println("Length of str3: " + str3.length());
        System.out.println("Character at index 4: " + str3.charAt(4));

        // 3. String Comparison
        String compare1 = "Java";
        String compare2 = "java";
        System.out.println("\n3. String Comparison:");
        System.out.println("Equals: " + compare1.equals(compare2));
        System.out.println("Equals Ignore Case: " + compare1.equalsIgnoreCase(compare2));
        System.out.println("Compare To: " + compare1.compareTo(compare2));

        // 4. String Searching
        System.out.println("\n4. String Searching:");
        String text = "This is a simple string.";
        System.out.println("Contains 'simple': " + text.contains("simple"));
        System.out.println("Index of 'is': " + text.indexOf("is"));
        System.out.println("Last index of 'is': " + text.lastIndexOf("is"));

        // 5. Substring Operations
        System.out.println("\n5. Substring Operations:");
        System.out.println("Substring (5 to 10): " + text.substring(5, 10));

        // 6. String Modification
        System.out.println("\n6. String Modification:");
        System.out.println("Replace 'simple' with 'short': " + text.replace("simple", "short"));
        System.out.println("To Upper Case: " + text.toUpperCase());
        System.out.println("To Lower Case: " + text.toLowerCase());

        // 7. Whitespace Handling
        String withSpaces = "   Hello Java!   ";
        System.out.println("\n7. Whitespace Handling:");
        System.out.println("Original: '" + withSpaces + "'");
        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        System.out.println("\n8. String Concatenation:");
        System.out.println("Using +: " + str1 + " " + str2);
        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

        // 9. String Splitting
        System.out.println("\n9. String Splitting:");
        String sentence = "Java,is,fun,to,learn";
        String[] words = sentence.split(",");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        System.out.println("\n10. StringBuilder Demo:");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, "Java");
        sb.deleteCharAt(5);
        System.out.println("Modified StringBuilder: " + sb.toString());

        // 11. String Formatting
        System.out.println("\n11. String Formatting:");
        String name = "Alice";
        int age = 30;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // 12. Validate Email with contains(), startsWith(), endsWith()
        System.out.println("\n12. Email Validation:");
        String email = "example@gmail.com";
        boolean isValid = email.contains("@") &&
                          email.startsWith("example") &&
                          email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println("Is Valid: " + isValid);
    }
}

