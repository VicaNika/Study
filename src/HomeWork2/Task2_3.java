package HomeWork2;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");


        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt(); // Заполнение массива элементами, введенными с клавиатуры
        }

        // Вывод массива с применением цикла for
        System.out.print ("Вывод:");
        for (int i = size; i > 0; i--) {

            System.out.print (" " + array[i-1]); // Вывод полученного массива в консоль
        }
        System.out.println();

        // Вывод массива с применением цикла while
        int i = size;
        System.out.print ("Вывод:");
        while (i>0){
            System.out.print(" " + array[i-1]);
            i--;
        }
        System.out.println();

        // Вывод массива с применением цикла foreach
        System.out.print ("Вывод:");
        reverseArray(array);
        for (int element:array){
            System.out.print(" " + element);
        }

    }
    public static void reverseArray (int[] array){
        int temp;
        for (int i = array.length-1, j = 0; i >=array.length/2 ; i--,j++) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }


    }

}
