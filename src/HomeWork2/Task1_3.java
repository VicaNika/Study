package HomeWork2;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number1 = in.nextLine();
        String number2 = in.nextLine();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);


        System.out.println(degree(num1,num2));
    }
    public static int degree (int num1, int num2){
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * num1;
        }

        return result;
    }

}
