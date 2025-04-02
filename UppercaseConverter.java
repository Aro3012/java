import java.util.*;
public class UppercaseConverter {
    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        String builtInUppercase = inputText.toUpperCase();
        String customUppercase = convertToUppercase(inputText);
        boolean isSame = compareStrings(builtInUppercase, customUppercase);
        System.out.println("Converted (Custom Method): " + customUppercase);
        System.out.println("Converted (Built-in Method): " + builtInUppercase);
        System.out.println("Are both methods giving the same result? " + isSame);
        scanner.close();
    }
}