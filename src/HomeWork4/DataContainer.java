package HomeWork4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class  DataContainer<T>  {

    public T[] getData() {

        return data;
    }

    private T[] data;
    private T[] newData;

    DataContainer(T[] array) {
        data = array;
        newData = array;
    }

    public int add(T item) {
        int i;

        for (i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
            if (item == null) {
                return -1;
            }

        }
        if (data[i - 1] != null) {

            T[] newData = Arrays.copyOf(data, data.length + 1);
            data = newData;
            i = newData.length - 1;
            newData[i] = item;

            return i;
        }

        return i;
    }

    public void print(T[] array) {
        System.out.print("Содержимое контейнера: ");
        System.out.println(Arrays.toString(array));
        System.out.println(System.lineSeparator());
    }

    public T get(int index) {
        int i = index;
        T item = data[i];
        if (index == data.length) {
            item = null;
        }

        return item;
    }

    boolean delete(int index) {

        if (index >= data.length) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (i > index) {
                data[i - 1] = data[i];
            }

        }
        data = Arrays.copyOf(data, data.length - 1);

        return true;
    }
    boolean deleteItem(T item){
        int j = 0;

        for (int i = 0; i < data.length; i++) {

            if (data[i] == item) {

                for (j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                data = Arrays.copyOf(data, data.length-1);
                return true;
            }

        }

        return false;
    }
    void sort (ComparatorT<T> comparator) {
        T temp;
        boolean isSorted = false; // переменная для опеределения отсортирован ли массив

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i< data.length-1; i++) {
                if (comparator.compare(data[i], data[i+1]) >= 0) {
                    isSorted = false;


                    temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                str.append(data[i]);
                str.append(", ");
            }
        }
        str.setLength(str.length()-2);

        return "Содержимое контейнера: " + "["
                 + str.toString()  + "]";
    }
    static void sort (DataContainer<? extends Comparable> container) {
        

    }
    static void sort (DataContainer<? extends Comparable> container, ComparatorT<? extends Comparator> comparator) {

    }

}
