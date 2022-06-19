package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Fraction {
    double numerator, denominator;

    /**
     * Конструктор дробных чисел
     * @param num1 - первое дробное число
     * @param num2 - второе дробное число
     */
    public Fraction(double num1, double num2) {
        this.numerator = num1;
        this.denominator = num2;
    }

    public Fraction(double num) {
        this(num, num);
    }
    public  Fraction() {
        this(0);
    }

    /**
     * Метод для получения дробного числа через ввод пользователя
     * @return - дробное число
     */
    public Fraction GetFraction() {
        Fraction fraction = new Fraction();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        boolean flag = scan.hasNextBigDecimal();
        if (!flag) {
            System.out.println("Not a double number!");
        }
        else {
            fraction.numerator = scan.nextDouble();
        }
        System.out.println("Enter the denominator: ");
        if (!flag) {
            System.out.println("Not a double number!");
        }
        else {
            fraction.denominator = scan.nextDouble();
        }
        return fraction;
    }

    /**
     * Метод сложения дробей
     * @param fr1 - первая дробь
     * @param fr2 - вторая дробь
     */
    public void Add(Fraction fr1, Fraction fr2) {
        Fraction result = new Fraction();
        if (Objects.equals(fr1.denominator, fr2.denominator)) {
            result.numerator = fr1.numerator + fr2.numerator;
            result.denominator = fr1.denominator;
            if (result.numerator % result.denominator == 0) {
                System.out.printf("result = %.0f", result.numerator / result.denominator);
            } else {
                System.out.printf("result = %.0f/%.0f", result.numerator, result.denominator);
            }
        }
        else {
            result.denominator = fr1.denominator * fr2.denominator;
            result.numerator = (fr1.numerator * fr2.denominator) + (fr2.numerator * fr1.denominator);
            if (result.numerator % result.denominator == 0) {
                System.out.printf("result = %.0f", result.numerator / result.denominator);
            } else {
                System.out.printf("result = %.0f/%.0f", result.numerator, result.denominator);
            }
        }
    }

    /**
     * Метод вычитания дробей
     * @param fr1 - первая дробь
     * @param fr2 - вторая дробь
     */
    public void Sub(Fraction fr1, Fraction fr2) {
        Fraction result = new Fraction();
        if (Objects.equals(fr1.denominator, fr2.denominator)) {
            result.numerator = fr1.numerator - fr2.numerator;
            result.denominator = fr1.denominator;
            System.out.printf("result = %.0f/%.0f", result.numerator, result.denominator);
        }
        else {
            result.denominator = fr1.denominator * fr2.denominator;
            result.numerator = (fr1.numerator * fr2.denominator) - (fr2.numerator * fr1.denominator);
            System.out.printf("result = %.0f/%.0f", result.numerator, result.denominator);
        }
    }

    /**
     * Метод умножения дробей
     * @param fr1 - первая дробь
     * @param fr2 - вторая дробь
     */
    public void Mul(Fraction fr1, Fraction fr2) {
        Fraction result = new Fraction();
        result.numerator = fr1.numerator * fr2.numerator;
        result.denominator = fr1.denominator * fr2.denominator;
        if (result.numerator % result.denominator == 0) {
            System.out.printf("result = %.0f", result.numerator / result.denominator);
        } else {
            System.out.printf("result = %.0f/%.0f", result.numerator, result.denominator);
        }
    }

    /**
     * Метод деления дробей
     * @param fr1 - дробь (делимое)
     * @param fr2 - дробь (делитель)
     */
    public void Div(Fraction fr1, Fraction fr2) {
        Fraction result = new Fraction();
        result.numerator = fr1.numerator * fr2.denominator;
        result.denominator = fr1.denominator * fr2.numerator;
        if (result.numerator % result.denominator == 0) {
            System.out.printf("result = %.0f", result.numerator / result.denominator);
        } else {
            System.out.printf("result = %.0f/%.0f", result.numerator, result.denominator);
        }
    }
}
