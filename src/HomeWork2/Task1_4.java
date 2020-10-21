package HomeWork2;

import java.math.BigInteger;

public class Task1_4 {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.MIN_VALUE +" , " +  Long.MAX_VALUE );
        System.out.println("Long.SIZE  =   " + Long.SIZE);
        System.out.println("Переполнение: " + (Long.MAX_VALUE+1));


        long a = 1;
        long b = Long.MAX_VALUE;


        while (a < b) {
             a *=3;
             if (a > 0 & a > (a*3)){
                 System.out.println("Число перед переполнением: " + a);
             }
             if (a < 0) {
                 throw new Exception("Число после переполнения: " + a);
             }
         }







    }
}
