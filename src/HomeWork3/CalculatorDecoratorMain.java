package HomeWork3;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        //4.1 + 15 * 7 + (28 / 5) ^ 2

        

    }
}
