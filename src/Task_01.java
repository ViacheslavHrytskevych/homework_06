public class Task_01 {

    public static void main(String[] args) {

        String text = "LoL12321 lol";

        System.out.println(isPalindrome(text));

    }

    static boolean isPalindrome(String text) {
        String smallLetter = text.toLowerCase();
        String alphanumeric = smallLetter.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder stringBuilder = new StringBuilder(alphanumeric);
        String palindrome = stringBuilder.reverse().toString();
        boolean textIsPalindrome = alphanumeric.equals(palindrome);
        return textIsPalindrome;
    }
}

