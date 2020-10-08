package HomeWork2;

import java.util.Scanner;

public class Task2_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt(); // Заполнение массива элементами, введенными с клавиатуры
        }

        // Вывод массива с применением цикла do...while

        System.out.print ("Вывод:");
        int i = size;
        do {
            System.out.print(" " + array[i-1]);
            i--;

        }while (i>0);
    }
}
