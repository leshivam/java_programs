package JavaBasics;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // Length
        System.out.println("Length of str3: " + str3.length());

        // Substring
        String subStr = str3.substring(0, 5);
        System.out.println("Substring of str3: " + subStr);

        // Character at index
        char ch = str3.charAt(6);
        System.out.println("Character at index 6: " + ch);

        // Convert to uppercase
        String upperStr = str3.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);
    }
}
