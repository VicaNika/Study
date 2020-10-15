package HomeWork2;

public class Task1_4 {
    public static void main(String[] args) {
        System.out.println(Long.MIN_VALUE +" , " +  Long.MAX_VALUE );
        System.out.println("Long.SIZE  =   " + Long.SIZE);
        long a;



        for (a = 1; a < 9223372036854664807L;) {
            a *= 3;
        }
        System.out.println("До переполнения: " + a);

//282429536481
    }
}
