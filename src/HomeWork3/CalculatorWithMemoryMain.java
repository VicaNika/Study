package HomeWork3;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithMathExtends());

        //4.1 + 15 * 7 + (28 / 5) ^ 2

        calculator.record(calculator.division(28, 5));
        System.out.println(calculator.getResult());
        calculator.record(calculator.grade(calculator.getResult(), 2));
        System.out.println(calculator.getResult());
        calculator.record(calculator.addition(calculator.getResult(), calculator.multiplication(15,7)));
        System.out.println(calculator.getResult());
        calculator.record(calculator.addition(calculator.getResult(), 4.1));
        System.out.println(calculator.getResult());

    }
}
