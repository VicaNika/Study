package HomeWork2;

public class Task1_4_2 {
    public static void main(String[] args) throws Exception {

        long a = 1;
        long b = Long.MAX_VALUE;


        while (a < b) {
            a *=188;
            if (a > 0 & a > (a*188)){
                System.out.println("Число перед переполнением: " + a);
            }
            if (a < 0) {
                throw new Exception("Число после переполнения: " + a);
            }
        }
    }
}
