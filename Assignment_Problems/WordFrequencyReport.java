import java.util.*;

public class WordFrequencyReport {

    public static void printFilteredWordFrequency(String feedback) {

        String[] stopWords = {
                "the", "was", "and", "a",
                "is", "of", "in"
        };

        HashSet<String> stopSet = new HashSet<>(
                Arrays.asList(stopWords));

        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (stopSet.contains(word)) {
                continue;
            }

            map.put(word,
                    map.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) ->
                b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> e : list) {
            System.out.println(
                    e.getKey() + ": " + e.getValue());
        }
    }

    public static void main(String[] args) {
        printFilteredWordFrequency(
                "The mentor was great, the session was great and clear.");
    }
}