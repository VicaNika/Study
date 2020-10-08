package HomeWork2;

import java.util.ArrayList;
import java.util.Collections;

public class TaskTest {
    public static void main(String[] args) {

        System.out.println(getResult(123456));


    }
    public static ArrayList<Integer> getResult (int arg){
        ArrayList <Integer> list = new ArrayList<>();

        while (arg!=0){
            list.add((int) arg%10);
            arg/=10;


        }

        return list;


    }

}


