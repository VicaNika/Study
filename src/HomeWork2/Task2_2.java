package HomeWork2;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");


        // Вывод массива с применением цикла for
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt(); // Заполнение массива элементами, введенными с клавиатуры
        }
        System.out.print ("Вывод:");
        for (int i = 0; i < size; i++) {
            if (i%2 == 0) {
                System.out.print (" " + array[i]); // Вывод полученного массива в консоль
            }

        }
        System.out.println();

    }
}
