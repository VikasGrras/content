package DSA.String;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (countMap.get(c) == 1) return c;
        }
        return '_'; // If no unique character found
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("swiss")); // Output: 'w'
    }
}

