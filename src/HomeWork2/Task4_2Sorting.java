package HomeWork2;

import java.util.Arrays;

public class Task4_2Sorting {
    public static void bubbleSort (int[] array) {
        int temp;
        boolean isSorted = false; // переменная для опеределения отсортирован ли массив

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i< array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    isSorted = false;


                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }


    }

  public static void shakerSort (int[] array) {
        int temp;
        boolean swapped; // переменная для опеределения перестановки
        do {
            swapped = false;
            for (int i = 0; i <= array.length-2;i++) {
                if (array[i] > array[i+1]) {

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temp;
                    swapped = true;
                }
            }
            if (!swapped) {

                break;
            }
            swapped = false;
            for (int i = array.length-2;i >= 0;i--) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temp;
                    swapped = true;
                }
            }

        } while (swapped);
    }
}
