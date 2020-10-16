package HomeWork3;

public class CalculatorWithOperator {

    // Метод деления
     public double division (double a, double b){
         double result= a/b;

         return result;
     }
     // Метод умножения
     public double multiplication (double a, double b){
         double result = a*b;

         return result;
     }
     // Метод вычитания
     public double subtraction (double a, double b){
         double result = a-b;

         return result;

     }
     // Метод сложения
    public double addition (double a, double b){
         double result = a+b;

         return result;
    }

    // Метод возведения в целую степень степень дробного положительного числа
    public double grade (double value, int grade) {

         double result = 1;
         for (double i = 1; i<=grade; i++){
             result = result*value;
         }

         return result;
    }

    // Метод для нахождения модуля числа
    public double module(double a){
        double module;
        if (a>=0){
             module = a*1;
         }
         else module = a*(-1);

         return module;
    }
    // Метод вычисления квадратного корня
    public double squareRoot (double value){
         double result = Math.sqrt(value);

         return result;
    }


}
