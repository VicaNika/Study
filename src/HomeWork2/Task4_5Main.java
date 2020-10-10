package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_5Main {
    public static void main(String[] args) {
        Task4_2Sorting a = new Task4_2Sorting();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");


        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt(); // Заполнение массива элементами, введенными с клавиатуры
        }

        System.out.println("______________Пузырьковая сортировка______________");

        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        a.bubbleSort(array);

        System.out.println("Массив после сортировки: " + Arrays.toString(array));

    }

}
