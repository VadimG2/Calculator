package Calculator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();
            
            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();
            
            System.out.print("Введите операцию (+, *, /): ");
            String operation = scanner.next();
            
            Calculator calculator = new SumDecorator(); // Базовый калькулятор
            //Калькулятор выполняет действие в зависимости от условия
            switch (operation) {
                case "+":
                    calculator = new SumDecorator();
                    break;
                case "*":
                    calculator = new MultipleDecorator(calculator);
                    break;
                case "/":
                    calculator = new DivisionDecorator(calculator);
                    break;
                default:
                    System.out.println("Неподдерживаемая операция.");
                    return;
            }
            
            try {
                double result = calculator.calculate(a, b);
                System.out.println("Результат: " + result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}