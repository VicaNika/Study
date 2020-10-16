package HomeWork3;

public class CalculatorWithMathCopy {
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

        double result = Math.pow(value, grade);

        return result;
    }


    // Метод для нахождения модуля числа
    public double module(double a){

        double result = Math.abs(a);

        return result;
    }
    // Метод вычисления квадратного корня
    public double squareRoot (double value){

        double result = Math.sqrt(value);

        return result;
    }
}
