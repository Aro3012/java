import java.util.*;
class StringSplitter {
    public static int findLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') {
                length++;
            }
        } catch (Exception e) {
            return length;
        }
        return length;
    }
    public static String[] customSplit(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        int[] spaceIndexes = new int[count - 1];
        int index = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ' && index < spaceIndexes.length) {
                spaceIndexes[index++] = i;
            }
        }
        String[] words = new String[count];
        int start = 0;
        for (int i = 0; i < count; i++) {
            int end = (i < spaceIndexes.length) ? spaceIndexes[i] : findLength(text);
            words[i] = text.substring(start, end);
            start = end + 1;
        }
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String[] customWords = customSplit(input);
        String[] builtInWords = input.split(" ");
        System.out.println("Custom split method result:");
        for (String word : customWords) {
            System.out.println(word);
        }
        System.out.println("\nBuilt-in split method result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        boolean areEqual = compareArrays(customWords, builtInWords);
        System.out.println("\nComparison result: " + areEqual);
    }
}