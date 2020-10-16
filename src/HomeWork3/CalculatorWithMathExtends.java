package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

    public double division(double a, double b) {

        return super.division(a, b);
    }

    public double multiplication(double a, double b) {

        return super.multiplication(a, b);
    }

    public double subtraction(double a, double b) {

        return super.subtraction(a, b);
    }

    public double addition(double a, double b) {

        return super.addition(a, b);
    }

    @Override
    public double grade(double value, int grade) {
        double result = Math.pow(value, grade);
        return result;
    }

    @Override
    public double module(double a) {
        double result = Math.abs(a);
        return result;
    }

    @Override
    public double squareRoot(double value) {

        double result = Math.sqrt(value);
        return result;
    }
}
