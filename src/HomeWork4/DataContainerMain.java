package HomeWork4;

import java.util.ArrayList;
import java.util.Arrays;

public class DataContainerMain {

    public static void main(String[] args) {


    DataContainer<Integer> container1 = new DataContainer<Integer>(new Integer[] {1, 2, 3, null, null, null});
    DataContainer<Integer> container2 = new DataContainer<Integer>(new Integer[] {1, 2, 3, null, null, null});
    DataContainer<Integer> container3 = new DataContainer<Integer>(new Integer[] {1, null, 3, null, null, null});
    DataContainer<Integer> container4 = new DataContainer<Integer>(new Integer[] {1, 2, 3, 3, 4, 5});
    DataContainer<Integer> container5 = new DataContainer<Integer>(new Integer[5]);
    DataContainer<String> container6 = new DataContainer<String>(new String[5]);
    ComparatorT <Integer> comparator = new ComparatorT<>();


        System.out.println( "Возвращаемый индекс: " + container1.add(777));
        container1.print(container1.getData());
        System.out.println("Возвращаемый индекс: " + container2.add(null));
        container2.print(container2.getData());
        System.out.println("Возвращаемый индекс: " + container3.add(777));
        container3.print(container3.getData());
        System.out.println("Возвращаемый индекс: " + container4.add(359));
        container4.print(container4.getData());
        System.out.println( "Возвращаемый индекс: " + container5.add(777));
        System.out.println( "Возвращаемый индекс: " + container5.add(15));
        System.out.println( "Возвращаемый индекс: " + container5.add(5));
        System.out.println( "Возвращаемый индекс: " + container5.add(13));
        System.out.println( "Возвращаемый индекс: " + container5.add(29));
        System.out.println( "Возвращаемый индекс: " + container5.add(85));
        System.out.println( "Возвращаемый индекс: " + container5.add(985));
        container5.print(container5.getData());
        System.out.println("Возвращаемое значение: " + container4.get(5));
        System.out.println("Возвращаемое значение: " + container5.get(6));

        container4.delete(0);
        container4.print(container4.getData());
        container4.delete(0);
        container4.print(container4.getData());
        System.out.println(container4.delete(5));
        container4.print(container4.getData());
        System.out.println(container4.deleteItem(5));
        container4.print(container4.getData());
        container5.sort(comparator);
        container4.print(container5.getData());
        System.out.println(container3.toString());
        System.out.println(container1.toString());





    }
}

