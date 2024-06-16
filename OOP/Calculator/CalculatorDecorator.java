package Calculator;

public class CalculatorDecorator implements Calculator{

    protected Calculator decoratedCalculator;

    public CalculatorDecorator(Calculator decoratedCalculator){
        this.decoratedCalculator = decoratedCalculator;
    }
    @Override
    public double calculate(double a, double b) {
        return decoratedCalculator.calculate(a,b);
    }
    
}
