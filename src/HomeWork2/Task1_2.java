package HomeWork2;
import java.util. *;

public class Task1_2 {
    public static void main(String[] args) {

        System.out.println(getResult2(12345)); // Печать результата 1.2
    }
    // 1.2
    public static int getResult2 (int arg){
        ArrayList <Integer> numList= new ArrayList<>();
        int result = 0;
        while (arg != 0) {
            result = arg%10;
            arg /=10;
            numList.add(result);






    }
        System.out.println(numList);
        return result;
}

}
