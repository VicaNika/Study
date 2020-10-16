package HomeWork3;

public class CalculatorWithCounter {
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithOperator calculator3;

public CalculatorWithCounter(CalculatorWithOperator calc){

    this.calculator1=calc;
}

    public CalculatorWithCounter(CalculatorWithMathCopy calc){
        this.calculator2=calc;
    }


}
