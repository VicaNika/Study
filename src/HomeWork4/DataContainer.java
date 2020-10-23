package HomeWork4;

import java.util.Arrays;

public class  DataContainer<T> {
    public T[] getData() {

        return data;
    }

    private T[] data;
    private T[] newData;
    private T[] deleteArray;

    DataContainer(T[] array)
    {
        data = array;
        newData = array;
        deleteArray = data;
    }

    public int add (T item)
    {
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
            i = newData.length - 1;
            newData [i] = item;

            return i;
        }

        return i;
    }

    public void print (T[] array) {
        System.out.print("Содержимое контейнера: ");
        System.out.println(Arrays.toString(array));
        System.out.println(System.lineSeparator());
    }

    public T get (int index) {
        int i = index;
        T item = data[i];
        if (index == data.length){
            item = null;
        }

        return  item;
    }
    boolean delete (int index){
        boolean isDeleted = false;
        if (index == 0){
            System.arraycopy(data, 1, deleteArray, 0, data.length-1);
            data = deleteArray;
            System.out.println(Arrays.toString(data));

        }

        return isDeleted;
    }
}
