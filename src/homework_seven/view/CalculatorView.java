package homework_seven.view;

import homework_seven.model.ComplexNumber;

public class CalculatorView {
    public void displayResult(ComplexNumber complexNumber, String message) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Result ")
                .append(message)
                .append(": ")
                .append(complexNumber.getReal())
                .append(complexNumber.getImaginary() >= 0 ? "+":"")
                .append(complexNumber.getImaginary())
                .append("i");
        System.out.println(stringBuilder.toString());
    }
}
