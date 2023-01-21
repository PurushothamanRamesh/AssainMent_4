public class UniqueCharacters {

    public static boolean hasUniqueChars(String s) {
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Hello, World!";
        boolean result = hasUniqueChars(s);
        if (result) {
            System.out.println("The string contains all unique characters.");
        } else {
            System.out.println("The string contains at least one duplicate character.");
        }
    }
}
