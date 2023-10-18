package homework_seven.model;

public abstract class CalculatorComplexNumber {

    protected ComplexNumber add(ComplexNumber complexNumberOne, ComplexNumber complexNumberTwo) {
        double newReal = complexNumberOne.getReal() + complexNumberTwo.getReal();
        double newImaginary = complexNumberOne.getImaginary() + complexNumberTwo.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    protected ComplexNumber subtract(ComplexNumber complexNumberOne, ComplexNumber complexNumberTwo) {
        double newReal = complexNumberOne.getReal() - complexNumberTwo.getReal();
        double newImaginary = complexNumberOne.getImaginary() - complexNumberTwo.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    protected ComplexNumber multiply(ComplexNumber complexNumberOne, ComplexNumber complexNumberTwo) {
        double newReal = complexNumberOne.getReal() * complexNumberTwo.getReal() -
                complexNumberOne.getImaginary() * complexNumberTwo.getImaginary();
        double newImaginary = complexNumberOne.getReal() * complexNumberTwo.getImaginary() +
                complexNumberOne.getImaginary() * complexNumberTwo.getReal();
        return new ComplexNumber(newReal, newImaginary);
    }

    protected ComplexNumber divide(ComplexNumber complexNumberOne, ComplexNumber complexNumberTwo) {
        double divisor = Math.pow(complexNumberTwo.getReal(), 2) + Math.pow(complexNumberTwo.getImaginary(), 2);
        double newReal = (complexNumberOne.getReal() * complexNumberTwo.getReal() +
                complexNumberOne.getImaginary() * complexNumberTwo.getImaginary()) / divisor;
        double newImaginary = (complexNumberOne.getImaginary() * complexNumberTwo.getReal() -
                complexNumberOne.getReal() * complexNumberTwo.getImaginary()) / divisor;
        return new ComplexNumber(newReal, newImaginary);
    }
}
