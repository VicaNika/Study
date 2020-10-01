package HomeWork1;
import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        String name = in.nextLine();

        String name1 = "Вася";
        String name2 = "Анастасия";

        if (name.equals(name1)) {
            System.out.print("Привет!" + '\n' + "Я тебя так долго ждал");
        } else if (name.equals(name2)){
            System.out.println("Я тебя так долго ждал");
        } else if (!name.equals(name1) && !name.equals(name2)) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
