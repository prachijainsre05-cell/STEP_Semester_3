public class WordReversalEncoder {

    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result += sb.reverse().toString() + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }
}