package HomeWork4;

public class ContainerMain {
    public static void main(String[] args) {

        Container<Integer> container1 = new Container<Integer>(new Integer[] {1, 2, 3, null, null, null});
        Container<Integer> container2 = new Container<Integer>(new Integer[] {1, 2, 3, null, null, null});
        Container<Integer> container3 = new Container<Integer>(new Integer[] {1, null, 3, null, null, null});
        Container<Integer> container4 = new Container<Integer>(new Integer[] {1, 2, 3, 3, 4, 5});
        Container<Integer> container5 = new Container<Integer>(new Integer[5]);


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
    }

}
