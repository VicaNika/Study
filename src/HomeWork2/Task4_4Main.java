package HomeWork2;

import java.util.Arrays;

public class Task4_4Main {
    public static void main(String[] args) {

        Task4_2Sorting a = new Task4_2Sorting();

        int size = (int) (Math.random() * 20);

        int[] array = new int[size];

        for (int i=0;i<array.length;i++)
            array[i] = (int) (10*Math.random() * size);

        int[] array2 = new int[size];

        for (int i=0;i<array2.length;i++)
            array2[i] = (int) (10*Math.random() * size);


        System.out.println("______________Пузырьковая сортировка______________");

        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        a.bubbleSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));

        System.out.println("______________Шейкерная сортировка______________");

        System.out.println("Массив до сортировки: " + Arrays.toString(array2));

        a.shakerSort(array2);

        System.out.println("Массив после сортировки: " + Arrays.toString(array2));


    }
}
