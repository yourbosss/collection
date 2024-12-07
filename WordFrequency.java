package org.example;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "This is a test. This test is only a test.";
        String[] words = text.toLowerCase().split("\\W+");
        Map<String, Integer> wordCount = new HashMap<>();

        // проходим по всем словам и обновляем их количество.
        for (String word : words) {
            if (!word.isEmpty()) {  // проверяем, что слово не пустое.
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // частота встречаемости каждого слова.
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
//entry.getKey() возвращает ключ (слово), а entry.getValue() — значение (частоту этого слова).
//цикл for (Map.Entry<String перебирает все элементы карты wordCount.
// на каждой итерации переменная entry будет содержать одну пару "ключ-значение".