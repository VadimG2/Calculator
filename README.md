# Calculator with Decorator Pattern

A simple console-based calculator implemented in Java. This project demonstrates the **Decorator** design pattern and adheres to the **SOLID** principles. It supports basic arithmetic operations: addition, multiplication, and division (with zero-check).

## Features

- Enter two numbers and choose an operation (`+`, `*`, `/`).
- Dynamically selects the appropriate operation using decorators.
- Graceful handling of division by zero with a custom exception message.
- Easily extendable with new operations without modifying existing code.

## Project Structure

- `Calculator` – interface declaring `calculate(double a, double b)`.
- `CalculatorDecorator` – abstract decorator class holding a reference to a `Calculator` and delegating the call.
- `SumDecorator` – concrete component that performs addition.
- `MultipleDecorator` – decorator that performs multiplication.
- `DivisionDecorator` – decorator that performs division, with a check for division by zero.
- `Program` – main class with user interaction and operation selection.

## SOLID Principles

- **Single Responsibility**  
  Each operation class (`SumDecorator`, `MultipleDecorator`, `DivisionDecorator`) handles exactly one arithmetic operation.

- **Open/Closed**  
  New operations can be added by creating a new decorator class (e.g., for subtraction or square root) without modifying existing classes.

- **Liskov Substitution**  
  All operation classes implement the `Calculator` interface and can be used interchangeably wherever a `Calculator` is expected.

- **Interface Segregation**  
  The `Calculator` interface contains only one method (`calculate`), so clients are not forced to depend on methods they do not use.

- **Dependency Inversion**  
  The `Program` class depends only on the `Calculator` abstraction, not on concrete implementations. The specific operation is chosen at runtime via a switch statement.

## Decorator Pattern in Action

The calculator uses the Decorator pattern to dynamically attach responsibilities (operations) to a base calculator object.  
- `SumDecorator` acts as the **concrete component** (the core behaviour).  
- `MultipleDecorator` and `DivisionDecorator` are **decorators** that wrap another `Calculator` and override the `calculate` method to provide their own logic.  

This design makes it easy to combine operations in the future (e.g., a decorator that logs the calculation before delegating).

## How to Run

1. Clone the repository or download the source files.
2. Compile all Java files:
   ```bash
   javac Calculator/*.java
   ```
3. Run the program:
   ```bash
   java Calculator.Program
   ```

## Example Usage

```
Enter first number: 10
Enter second number: 0
Enter operation (+, *, /): /
Result: Cannot divide by zero! Please enter another b
```

```
Enter first number: 5
Enter second number: 3
Enter operation (+, *, /): *
Result: 15.0
```

## Possible Enhancements

- Add more operations (subtraction, power, square root) by implementing new decorators.
- Introduce logging or validation decorators.
- Build a GUI version using the same core logic.

---

Feel free to use this project as a learning example for the Decorator pattern and SOLID principles in Java.
