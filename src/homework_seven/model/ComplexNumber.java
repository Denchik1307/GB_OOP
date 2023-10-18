package homework_seven.model;

import java.util.Objects;
import java.util.Scanner;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        var tmp = (ComplexNumber) obj;
        return Double.doubleToLongBits(this.real) == Double.doubleToLongBits(tmp.real) &&
                Double.doubleToLongBits(this.imaginary) == Double.doubleToLongBits(tmp.imaginary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ComplexNumber => ")
                .append(real)
                .append(imaginary >= 0 ? "+" : "")
                .append(imaginary)
                .append("i");
        return stringBuilder.toString();
    }
}
