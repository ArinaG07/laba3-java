package task1;

import java.util.*;

public class Task1_Collections {
    public static void run() {
        int n = 15;
        Random random = new Random();


        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println("1. Исходный массив: " + Arrays.toString(array));


        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("2. Список List: " + list);


        Collections.sort(list);
        System.out.println("3. Отсортированный по возрастанию: " + list);


        Collections.reverse(list);
        System.out.println("4. Отсортированный в обратном порядке: " + list);


        Collections.shuffle(list);
        System.out.println("5. Перемешанный список: " + list);


        Collections.rotate(list, 1);
        System.out.println("6. Циклический сдвиг на 1 элемент: " + list);


        List<Integer> uniqueList = new ArrayList<>();
        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        System.out.println("7. Только уникальные элементы: " + uniqueList);


        List<Integer> duplicatesList = new ArrayList<>();
        for (Integer num : list) {
            if (Collections.frequency(list, num) > 1 && !duplicatesList.contains(num)) {
                duplicatesList.add(num);
            }
        }
        System.out.println("8. Только дублирующиеся элементы: " + duplicatesList);


        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("9. Полученный массив: " + Arrays.toString(newArray));


        System.out.println("10. Количество вхождений каждого числа:");
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("  Число " + entry.getKey() + " встретилось " + entry.getValue() + " раз(а)");
        }
    }
}

