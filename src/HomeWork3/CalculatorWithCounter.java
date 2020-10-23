package HomeWork3;
// Честно признаюсь, что сама не додумалась до этого, поэтому списывала с видео с разбором.
public class CalculatorWithCounter {
    private long count;
    private final CalculatorWithOperator calculator1;
    private final CalculatorWithMathCopy calculator2;
    private final CalculatorWithMathExtends calculator3;

public CalculatorWithCounter(CalculatorWithOperator calc){
    this.calculator1 = calc;
    this.calculator2 = null;
    this.calculator3 = null;

}
public CalculatorWithCounter(CalculatorWithMathCopy calc) {
    this.calculator1 = null;
    this.calculator2 = calc;
    this.calculator3 = null;
}
public CalculatorWithCounter(CalculatorWithMathExtends calc) {
    this.calculator1 = null;
    this.calculator2 = null;
    this.calculator3 = calc;
}
    // Метод деления
    public double division (double a, double b){
    count++;
    if (this.calculator1 != null) {
        return this.calculator1.division(a, b);
    } else if (this.calculator2 != null) {
        return this.calculator2.division(a, b);
    }
    return this.calculator3.division(a, b);
    }
    // Метод умножения
    public double multiplication (double a, double b){
        count++;
        if (this.calculator1 != null) {
            return this.calculator1.multiplication(a, b);
        } else if (this.calculator2 != null) {
            return this.calculator2.multiplication(a, b);
        }
        return this.calculator3.multiplication(a, b);
    }
    // Метод вычитания
    public double subtraction (double a, double b){
        count++;
        if (this.calculator1 != null) {
            return this.calculator1.subtraction(a, b);
        } else if (this.calculator2 != null) {
            return this.calculator2.subtraction(a, b);
        }
        return this.calculator3.subtraction(a, b);
    }
    // Метод сложения
    public double addition (double a, double b){
        count++;
        if (this.calculator1 != null) {
            return this.calculator1.addition(a, b);
        } else if (this.calculator2 != null) {
            return this.calculator2.addition(a, b);
        }
        return this.calculator3.addition(a, b);
    }
    // Метод возведения в целую степень степень дробного положительного числа
    public double grade (double value, int grade) {
        count++;
        if (this.calculator1 != null) {
            return this.calculator1.grade(value, grade);
        } else if (this.calculator2 != null) {
            return this.calculator2.grade(value, grade);
        }
        return this.calculator3.grade(value, grade);
    }

    // Метод для нахождения модуля числа
    public double module(double a){
        count++;
        if (this.calculator1 != null) {
            return this.calculator1.module(a);
        } else if (this.calculator2 != null) {
            return this.calculator2.module(a);
        }
        return this.calculator3.module(a);
    }
    // Метод вычисления квадратного корня
    public double squareRoot (double value){
        count++;
        if (this.calculator1 != null) {
            return this.calculator1.squareRoot(value);
        } else if (this.calculator2 != null) {
            return this.calculator2.squareRoot(value);
        }
        return this.calculator3.squareRoot(value);
    }
long getCountOperation () {

    return count;
}





}
