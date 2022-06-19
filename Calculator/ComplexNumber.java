package Calculator;

import java.util.Scanner;


public class ComplexNumber {
    double real, imag;

    /**
     * Конструктор комплексных чисел
     * @param num1 - вещественное число
     * @param num2 - вещественное число
     */
    public ComplexNumber(double num1, double num2) {
        this.real = num1;
        this.imag = num2;
    }
    public ComplexNumber(double num) {
        this(num, num);
    }
    public ComplexNumber() {
        this(0);
    }

    /**
     * Метод для получения комплексного числа через ввод пользователя
     * @return комплексное число
     */
    public ComplexNumber GetComplexNumber() {
        ComplexNumber number = new ComplexNumber();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the real part of the number: ");
        boolean flag = scan.hasNextBigDecimal();
        if (!flag) {
            System.out.println("Not a double number!");
        }
        else {
            number.real = scan.nextDouble();
        }
        System.out.println("Enter the imaginary part of the number: ");
        if (!flag) {
            System.out.println("Not a double number!");
        }
        else {
            number.imag = scan.nextDouble();
        }
        return number;
    }

    /**
     * Метод сложения комплексных чисел
      * @param number1 - первое комплексное число
     * @param number2 - второе комплексное число
     */
    public void Add(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = new ComplexNumber();
        result.real = number1.real + number2.real;
        result.imag = number1.imag + number2.imag;
        if (result.imag < 0) {
            System.out.printf("result = %.1f %.1fi", result.real, result.imag);
        }
        else {
            System.out.printf("result = %.1f + %.1fi", result.real, result.imag);
        }

    }
    /**
     * Метод вычитания комплексных чисел
     * @param number1 - первое комплексное число
     * @param number2 - второе комплексное число
     */
    public void Sub(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = new ComplexNumber();
        result.real = number1.real - number2.real;
        result.imag = number1.imag - number2.imag;
        if (result.imag < 0) {
            System.out.printf("result = %.1f %.1fi", result.real, result.imag);
        }
        else {
            System.out.printf("result = %.1f + %.1fi", result.real, result.imag);
        }
    }
    /**
     * Метод умножения комплексных чисел
     * @param number1 - первое комплексное число
     * @param number2 - второе комплексное число
     */
    public void Mul(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = new ComplexNumber();
        result.real = (number1.real * number2.real - number1.imag * number2.imag);
        result.imag = (number1.real * number2.imag + number2.real * number1.imag) * -1;
        if (result.imag < 0) {
            System.out.printf("result = %.1f %.1fi", result.real, result.imag);
        }
        else {
            System.out.printf("result = %.1f + %.1fi", result.real, result.imag);
        }
    }
    /**
     * Метод деления комплексных чисел
     * @param number1 - делимое комплексное число
     * @param number2 - делитель комплексного числа
     */
    public void Div(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = new ComplexNumber();
        result.real = (number1.real * number2.real - number1.imag * number2.imag);
        result.imag = (number1.real * number2.imag + number2.real * number1.imag) * -1;
        double denominator = Math.pow(number2.real, 2) + Math.pow(number2.imag, 2) * -1;
        if (result.imag < 0) {
            System.out.printf("result = %.0f/%.0f %.0fi/%.0f", result.real, denominator, result.imag, denominator);
        }
        else {
            System.out.printf("result = %.0f/%.0f + %.0fi/%.0f", result.real, denominator, result.imag, denominator);
        }
    }
}