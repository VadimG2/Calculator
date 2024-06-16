package Calculator;

public class MultipleDecorator extends CalculatorDecorator{

    public MultipleDecorator(Calculator decoratedCalculator) {
        super(decoratedCalculator);
    }

    public double calculate(double a, double b){
        return a * b;
    }
    
}
