package homework_seven;

import homework_seven.controller.CalculatorComplexNumberController;
import homework_seven.model.ComplexNumber;
import homework_seven.view.CalculatorView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        test1();

        test2();
    }

    private static void test1() {
        ComplexNumber firstNumber = new ComplexNumber(2, 3);
        ComplexNumber secondNumber = new ComplexNumber(1, -2);

        CalculatorView view = new CalculatorView();
        CalculatorComplexNumberController controller = new CalculatorComplexNumberController(view);

        String[] operators = {"+", "-", "*", "/"};

        System.out.println(firstNumber.toString());
        System.out.println(secondNumber.toString());
        System.out.println();

        for (String operator : operators) {
            controller.calculate(firstNumber, secondNumber, operator);
        }
    }

    private static void test2() {
        ComplexNumber firstNumber = createComplexNumber();
        ComplexNumber secondNumber = createComplexNumber();

        CalculatorView view = new CalculatorView();
        CalculatorComplexNumberController controller = new CalculatorComplexNumberController(view);

        String[] operators = {"+", "-", "*", "/"};

        System.out.println();
        System.out.println(firstNumber.toString());
        System.out.println(secondNumber.toString());
        System.out.println();

        for (String operator : operators) {
            controller.calculate(firstNumber, secondNumber, operator);
        }
    }

    private static ComplexNumber createComplexNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real complex number: ");
        double real = scanner.nextDouble();

        System.out.print("Enter the imaginary complex number: ");
        double imaginary = scanner.nextDouble();

        return new ComplexNumber(real, imaginary);
    }
}