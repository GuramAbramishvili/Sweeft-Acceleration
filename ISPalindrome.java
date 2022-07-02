public class ISPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("aaassssaaa"));
    }

    public static boolean isPalindrome(String text) {
        StringBuilder sb = new StringBuilder(text);
        String reversedText = sb.reverse()
                .toString();
        return reversedText.trim()
                .equalsIgnoreCase(text.trim());
    }
}

