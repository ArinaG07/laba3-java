package task5;

import java.util.*;

public class Task5_MapSwap {

    public static <K, V> Map<V, List<K>> swapMap(Map<K, V> sourceMap) {
        Map<V, List<K>> swappedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : sourceMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();
            swappedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }
        return swappedMap;
    }

    public static void run() {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("First", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);

        System.out.println("Исходная Map: " + originalMap);

        Map<Integer, List<String>> invertedMap = swapMap(originalMap);
        System.out.println("Инвертированная Map: " + invertedMap);
    }
}

