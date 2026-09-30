package task4;

import java.util.HashMap;
import java.util.Map;

public class Task4_WordFrequency {
    public static void run() {
        String text = "Hello world! Hello Java, hello world. Welcome to the java world.";

        String cleanedText = text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] words = cleanedText.split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Частота встречаемости слов в тексте:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

