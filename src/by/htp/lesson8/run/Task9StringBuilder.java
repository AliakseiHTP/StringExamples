package by.kazak.string;

import java.util.HashMap;

public class Task9StringBuilder {
    public static void main(String[] args) {
        String sText = "Here and so it turned out and so it happened";
        String[] aWords = sText.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : aWords) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));
        }
    }
}
