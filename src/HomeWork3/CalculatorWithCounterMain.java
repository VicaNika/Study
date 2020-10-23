package HomeWork3;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithOperator());
        calculator = new CalculatorWithCounter(new CalculatorWithMathExtends());
        calculator = new CalculatorWithCounter(new CalculatorWithMathCopy());


        double multi = calculator.multiplication(15.0, 7.0);
        double div = calculator.division(28.0, 5.0);
        double grade = calculator.grade(div, 2);
        double add = calculator.addition(4.1, multi);

        System.out.println(calculator.addition(add, grade));
        System.out.println(calculator.getCountOperation());
    }
}
