package HomeWork2;
import java.util. *;

public class Task1_2 {
    public static void main(String[] args) {

        System.out.println(" = " + getResult2(568426)); // Печать результата 1.2
    }
    // 1.2
    public static int getResult2 (int arg){
        ArrayList <Integer> numList= new ArrayList<>();
        int value = 0;
        while (arg != 0) {
            value = arg%10;
            arg /=10;
            numList.add(value);

    }
        Collections.reverse(numList);
        int result = 1;
        for (int i =0; i<numList.size(); i++){
            if (i == numList.size()-1) {

                System.out.print(numList.get(i));

            } else

                System.out.print(numList.get(i) + " * ");

            result *= numList.get(i);
        }

        return result;
}

}
