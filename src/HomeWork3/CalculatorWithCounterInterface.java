package HomeWork3;

public class CalculatorWithCounterInterface {
    private long count;
    private final ICalculator calc;


    public CalculatorWithCounterInterface(ICalculator calc){

        this.calc = calc;
    }

    // Метод деления
    public double division (double a, double b){
        count++;
        return this.calc.division(a, b);
    }
    // Метод умножения
    public double multiplication (double a, double b){
        count++;

        return this.calc.multiplication(a, b);
    }
    // Метод вычитания
    public double subtraction (double a, double b){
        count++;

        return this.calc.subtraction(a, b);
    }
    // Метод сложения
    public double addition (double a, double b){
        count++;

        return this.calc.addition(a, b);
    }
    // Метод возведения в целую степень степень дробного положительного числа
    public double grade (double value, int grade) {
        count++;

        return this.calc.grade(value, grade);
    }

    // Метод для нахождения модуля числа
    public double module(double a){
        count++;

        return this.calc.module(a);
    }
    // Метод вычисления квадратного корня
    public double squareRoot (double value){
        count++;

        return this.calc.squareRoot(value);
    }
    long getCountOperation () {

        return count;
    }
}
