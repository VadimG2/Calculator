package Calculator;

public class SumDecorator implements Calculator {

    @Override
    public double calculate(double a, double b) {
        return a + b;

    }
}