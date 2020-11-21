package HomeWork2;
import java.util. *;

public class Task1_2 {
    public static void main(String[] args) {

        System.out.println(" = " + getResult(568426)); // Печать результата 1.2
    }
    // 1.2 Способ с использованием ArrayList - не подходит
/*    public static int getResult2 (int arg){
        ArrayList <Integer> numList= new ArrayList<>();
        int value = 0;
        while (arg != 0) {
            value = arg%10;
            arg /= 10;
            numList.add(value);

    }
        Collections.reverse(numList);
        int result = 1;
        for (int i = 0; i<numList.size(); i++){
            if (i == numList.size()-1) {

                System.out.print(numList.get(i));

            } else

                System.out.print(numList.get(i) + " * ");

            result *= numList.get(i);
        }

        return result;
}
 */

    // Способ с использованием массива и циклов
    public static int getResult(int arg) {
        //String str = String.join(", ", String.valueOf(arg).split(""));
        String str = String.valueOf(arg);
        String[] arr = str.split("");
        int[] numArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            numArr[i] = Integer.parseInt(arr[i]);
        }
        int result = 1;

        for (int i = 0; i < numArr.length; i++) {
            if (i == numArr.length-1) {
                System.out.print(numArr[i]);

            } else
                System.out.print(arr[i] + "*");
            result *= numArr[i];
        }
        return result;
    }

}

