package HomeWork2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(" = " + getResult(5)); // Печать результата 1.1


    }
    // 1.1
    public static int getResult (int arg){ // Метод для расчета результата перемножения
        int result = 1;
        for (int num = 1; num <=arg; num++){

                System.out.print(num + " * ");

            result = result *num;

        }
        return result;

    }

}
