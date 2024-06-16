package Calculator;

public class DivisionDecorator extends CalculatorDecorator{

    public DivisionDecorator(Calculator decoratedCalculator) {
        super(decoratedCalculator);
    }

    public double calculate(double a, double b) {
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("На ноль делить нельзя! Введите другое b");
        }
    }
    
}
