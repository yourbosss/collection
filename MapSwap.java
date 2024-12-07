package org.example;
import java.util.*;

public class MapSwap {

    public static <K, V> Map<V, List<K>> swapKeysAndValues(Map<K, V> originalMap) {
        Map<V, List<K>> swappedMap = new HashMap<>(); //(структуура данных ключ - значение)

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            K key = entry.getKey();     // Исходный ключ
            V value = entry.getValue(); // Исходное значение
            // в новой карте для каждого значения добавляем соответствующие ключи в список.
            swappedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }
        return swappedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("John", 50000);
        originalMap.put("Alice", 60000);
        originalMap.put("Bob", 55000);
        originalMap.put("Mike", 70000);
        originalMap.put("Emma", 55000);

        Map<Integer, List<String>> swappedMap = swapKeysAndValues(originalMap);

        System.out.println("Swapped Map: " + swappedMap);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("apple", "fruit");
        stringMap.put("carrot", "vegetable");
        stringMap.put("banana", "fruit");
        Map<String, List<String>> swappedStringMap = swapKeysAndValues(stringMap);
        System.out.println("Swapped String Map: " + swappedStringMap);
    }
}
