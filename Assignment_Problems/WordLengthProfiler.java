class WordLengthProfiler {

    void classifyWordLengths(String review) {

        String[] words = review.split(" ");

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {

            int len = word.length();

            if (len >= 1 && len <= 4)
                shortCount++;
            else if (len >= 5 && len <= 8)
                mediumCount++;
            else
                longCount++;
        }

        System.out.println("Short: " + shortCount);
        System.out.println("Medium: " + mediumCount);
        System.out.println("Long: " + longCount);
    }

    public static void main(String[] args) {

        String review =
                "This movie was absolutely fantastic and thrilling";

        WordLengthProfiler obj = new WordLengthProfiler();
        obj.classifyWordLengths(review);
    }
}