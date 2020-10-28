package HomeWork3;

public class CalculatorWithCounterDecorator implements ICalculator {
    private  ICalculator calculator;
    private long count;

    public CalculatorWithCounterDecorator(CalculatorWithMemoryDecorator calculator) {

        this.calculator = calculator;
    }
    // Метод деления
    public double division (double a, double b){
        count++;

        return this.calculator.division(a, b);
    }
    // Метод умножения
    public double multiplication (double a, double b){
        count++;

        return this.calculator.multiplication(a, b);
    }
    // Метод вычитания
    public double subtraction (double a, double b){
        count++;

        return this.calculator.subtraction(a, b);
    }
    // Метод сложения
    public double addition (double a, double b){
        count++;

        return this.calculator.addition(a, b);
    }
    // Метод возведения в целую степень степень дробного положительного числа
    public double grade (double value, int grade) {
        count++;

        return this.calculator.grade(value, grade);
    }

    // Метод для нахождения модуля числа
    public double module(double a){
        count++;

        return this.calculator.module(a);
    }
    // Метод вычисления квадратного корня
    public double squareRoot (double value){
        count++;

        return this.calculator.squareRoot(value);
    }
    long getCountOperation () {

        return count;
    }

    ICalculator getCalculator () {

        return this.calculator;
    }
}
