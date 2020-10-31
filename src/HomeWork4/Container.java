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


    boolean delete(int index) {
        if (index == 0) {
            System.arraycopy(data, 1, data, 0, data.length-1);
            data = Arrays.copyOf(data, data.length-1);
        } else if (index == data.length-1){
            for (int i = 0; i< data.length-1; i++){
                data[i] = data[i];
            }
            data = Arrays.copyOf(data, data.length-1);
        }
        else {
            for (int i =0; i < data.length; i++){
                if (i > index){
                    data[i-1] = data[i];
                }
                if (i == index){
                    continue;
                }
                if (i < index){
                    data[i] = data[i];
                }
            }
            data = Arrays.copyOf(data, data.length-1);
        }

        return true;
    }
}


/*for (data[i] != null){

                T[] newData = Arrays.copyOf(data, data.length + 1);
                data[i] = item;

            }

 */