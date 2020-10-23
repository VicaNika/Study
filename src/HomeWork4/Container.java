package HomeWork4;

import java.util.Arrays;

public class Container<T> {
    public T[] getData() {

        return data;
    }

    private T[] data;
    private T[] newData;

    Container(T[] array)
    {
        data = array;
        newData = array;
    }

    public int add (T item)
    {
        // поиск свободной ячейки и добавление в нее item

        int i;

        for ( i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
            if (item == null) {
                return -1;
            }
        }
        if (data[i-1] != null) {

            T[] newData = Arrays.copyOf(data, data.length + 1);
            data = newData;
            System.out.println("Новая длина массива : " + newData.length);
            i = newData.length - 1;
            newData [i] = item;
            System.out.println(Arrays.toString(newData));
            return i;

        }

        return i;
    }

    public void print (T[] array) {
        System.out.print("Содержимое контейнера: ");
        System.out.println(Arrays.toString(array));
        System.out.println(System.lineSeparator());
    }
}


/*for (data[i] != null){

                T[] newData = Arrays.copyOf(data, data.length + 1);
                data[i] = item;

            }

 */