package HomeWork2;
import java.util.Scanner;

public class Task2 {
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
            System.out.print (" " + array[i]); // Вывод полученного массива в консоль
        }
        System.out.println();

        // Вывод массива с применением цикла while
        int i =0;
        System.out.print ("Вывод:");
        while (i<size){
            System.out.print(" " + array[i]);
            i++;
        }
        System.out.println();

        // Вывод массива с применением цикла do...while

  /*      System.out.print ("Вывод:");
        do {
            System.out.println(" " + array[i]);
            i++;

        }while (i<size);

*/
        // Вывод массива с применением цикла foreach

        System.out.print ("Вывод:");
        for (int element:array){
            System.out.print(" " + element);
        }




    }
}
