package Lesson2;

public class HomeWork2 {
    public HomeWork2() {}

    // Написать метод, возвращающий количество чётных элементов массива.
    // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public int CounterOfEvenNumbers (int[] array) {
        int count = 0;
        for (int i : array) if (i % 2 == 0) count++;
        return count;
    }



    // Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
    // переданного не пустого массива.
    public int scope(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (min > i) min = i;
            if (max < i) max = i;
        }
        return max - min;
    }

    // Написать функцию, возвращающую истину, если в переданном массиве есть два
    // соседних элемента, с нулевым значением.
    public boolean TwoNeighbours(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == 0 && array[i+1] == 0) return true;
        }
        return false;
    }

}