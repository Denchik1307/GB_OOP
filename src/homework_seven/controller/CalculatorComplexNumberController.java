package homework_seven.controller;


import homework_seven.model.CalculatorComplexNumber;
import homework_seven.model.ComplexNumber;
import homework_seven.view.CalculatorView;

public class CalculatorComplexNumberController extends CalculatorComplexNumber {
    private final CalculatorView view;

    public CalculatorComplexNumberController(CalculatorView view) {
        this.view = view;
    }

    public void calculate(ComplexNumber firstNumber, ComplexNumber secondNumber, String operator) {
        ComplexNumber complexNumber;
        String message;

        switch (operator) {
            case "+" -> {
                complexNumber = add(firstNumber, secondNumber);
                message = "add";
            }
            case "-" -> {
                complexNumber = subtract(firstNumber, secondNumber);
                message = "subtract";
            }
            case "*" -> {
                complexNumber = multiply(firstNumber, secondNumber);
                message = "multiply";
            }
            case "/" -> {
                complexNumber = divide(firstNumber, secondNumber);
                message = "divide";
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        view.displayResult(complexNumber, message);
    }
}
