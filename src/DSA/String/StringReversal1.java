package DSA.String;

public class StringReversal1 {
    // Using StringBuilder (Efficient)
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString()); // "olleh"
    }
}

