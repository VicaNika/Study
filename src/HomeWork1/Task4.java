package HomeWork1;

public class Task4 {
    public static void main(String[] args) {

     if (sleepIn(false, true))

         System.out.println("Можем спать");

         if (sleepIn(true, true))

             System.out.println("Можем спать");

             if (sleepIn(true, false))

                 System.out.println("Пора идти на работу");
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {

            return true;

        } else if (weekday || !vacation){

            return true;
        }
        return false;



    }
}


