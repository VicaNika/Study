package HomeWork1;
import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        String name = in.nextLine();

        String name1 = "Вася";
        String name2 = "Анастасия";

        switch (name){
            case  "Вася":
                System.out.print("Привет!" + '\n' + "Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");


        }
    }
}
