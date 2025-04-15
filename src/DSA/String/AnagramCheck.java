package DSA.String;
import java.util.Arrays;

public class AnagramCheck {
    //Two strings are anagrams if they contain the same characters
    // in different orders (e.g., "listen" and "silent").
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("java", "jvaa"));     // true
    }
}
