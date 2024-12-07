package org.example;
import java.util.*;

public class CollectionOperations {
    public static void main(String[] args) {
        // a) Создаем массив из N случайных чисел от 0 до 100
        int N = 20;  // Размер массива
        int[] array = new int[N];
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = rand.nextInt(101);  // Генерация числа от 0 до 100
        }

        // Выводим массив
        System.out.println("Массив: " + Arrays.toString(array));

        // b) На основе массива создаем список List
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        // Выводим список
        System.out.println("Список: " + list);

        // c) Сортируем список по возрастанию
        Collections.sort(list);
        System.out.println("Сортированный список по возрастанию: " + list);

        // d) Сортируем список в обратном порядке
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Сортированный список по убыванию: " + list);

        // e) Перемешиваем список
        Collections.shuffle(list);
        System.out.println("Перемешанный список: " + list);

        // f) Циклический сдвиг на 1 элемент
        Collections.rotate(list, 1);
//        if (!list.isEmpty()) {
//            int first = list.remove(0);  // Удаляем первый элемент
//            list.add(first);  // Добавляем его в конец списка
//        }
        System.out.println("Список после циклического сдвига: " + list);

        // g) Оставляем в списке только уникальные элементы
        Set<Integer> uniqueSet = new HashSet<>(list);  // Используем HashSet для уникальности
        list = new ArrayList<>(uniqueSet);
        System.out.println("Список с уникальными элементами: " + list);

        // h) Оставляем в списке только дублирующиеся элементы
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        list.clear();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }
        System.out.println("Список с дублирующимися элементами: " + list);

        // i) Из списка получаем массив
        Integer[] arrayFromList = list.toArray(new Integer[0]);
        System.out.println("Массив из списка: " + Arrays.toString(arrayFromList));

        // j) Подсчитываем количество вхождений каждого числа в массив и выводим
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Количество вхождений каждого числа в массив:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
