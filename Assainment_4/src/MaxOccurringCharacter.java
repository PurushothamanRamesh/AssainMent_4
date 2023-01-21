public class MaxOccurringCharacter {

    public static char maxOccurringCharacter(String s) {
        int[] charCount = new int[256];
        int max = 0;
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
            if (max < charCount[s.charAt(i)]) {
                max = charCount[s.charAt(i)];
                result = s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Hello, World!";
        char maxChar = maxOccurringCharacter(s);
        System.out.println("The maximum occurring character is: " + maxChar);
    }
}
