import Lesson2.Seminar2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Seminar2 seminar2 = new Seminar2();
        int[] array = {1,2,3,4,5};
        System.out.println("Результат: " + Arrays.toString(seminar2.Task1(array, 6, 4)));
        array = new int[]{2, 1, 3, 4, 5, 8, 1, 2, 10, 20};
        System.out.println("Результат: " + Arrays.toString(seminar2.Task2(array)));
    }
}