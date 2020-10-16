package HomeWork3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();

        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double multi = calc.multiplication(15.0, 7.0);
        double div = calc.division(28.0, 5.0);
        double grade = calc.grade(div, 2);
        double add = calc.addition(4.1, multi);

        System.out.println(calc.addition(add, grade));

    }
}
