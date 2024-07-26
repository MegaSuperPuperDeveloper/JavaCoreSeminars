package Lesson2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Seminar2 {
    public Seminar2() {}

    /**
     * Функция ставит elem на индекс index, сдвигая массив вправо и при пеобходиости, удалить последний элемент
     * @param array
     * @param elem
     * @param index
     * @return
     */
    public int[] Task1(int[] array, int elem, int index) {
        if (index < 0 || array.length < index) throw new ArrayIndexOutOfBoundsException("Ошибка! Индекс больше размера массива либо индекс меньше нуля.");
        int[] arr2 = Arrays.copyOf(array, array.length);
        array[index] = elem;
        for (int i = index + 1; i < array.length; i++) {
            array[i] = arr2[i-1];
        }
        return array;
    }

    public int[] Task2(int[] array) { // Метод сортирует массив голубинным методом
        int[] res = new int[array.length];
        int index = 0;
        Map<Integer, Integer> counter1 = new TreeMap<>(); // цифра, количество цифр в массиве
        for (int j : array) {
            if (counter1.containsKey(j)) {
                counter1.put(j, counter1.get(array[j]) + 1);
            } else {
                counter1.put(j, 1);
            }
        }
        for (Integer key : counter1.keySet()) {
            for (int j = 0; j < counter1.get(key); j++) {
                res[index++] = key;
            }
        }
        return res;
    }

}
