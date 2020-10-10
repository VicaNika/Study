package HomeWork2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task4_2Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6};

        Task4_2Sorting m = new Task4_2Sorting();

        System.out.println("______________Пузырьковая сортировка______________");

        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        m.bubbleSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));

        System.out.println("______________Шейкерная сортировка______________");

        array = new int[]{1,2,3,4,5,6};

        System.out.println("Масссив до сортировки: " + Arrays.toString(array));

        m.shakerSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));


        System.out.println("______________Пузырьковая сортировка______________");

        array = new int[]{1,1,1,1};

        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        m.bubbleSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));

        System.out.println("______________Шейкерная сортировка______________");

        array = new int[]{1,1,1,1};

        System.out.println("Масссив до сортировки: " + Arrays.toString(array));

        m.shakerSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));


        System.out.println("______________Пузырьковая сортировка______________");

        array = new int[]{9,1,5,99,9,9};

        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        m.bubbleSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));

        System.out.println("______________Шейкерная сортировка______________");

        array = new int[]{9,1,5,99,9,9};

        System.out.println("Масссив до сортировки: " + Arrays.toString(array));

        m.shakerSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));


        System.out.println("______________Пузырьковая сортировка______________");

        array = new int[]{};

        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        m.bubbleSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));

        System.out.println("______________Шейкерная сортировка______________");

        array = new int[]{};

        System.out.println("Масссив до сортировки: " + Arrays.toString(array));

        m.shakerSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));


    }
}
