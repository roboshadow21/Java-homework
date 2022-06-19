package Calculator;


import java.util.Scanner;

public class UserMenu {

    /**
     * Метод вызывает меню пользователя
      */
    public void CalcMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the type of numbers:\nComplex - 1\nFraction - 2\n: ");
        String choice = scan.nextLine();
        switch (choice) {
            case "1" -> {
                ComplexNumberArithmetic();
            }
            case "2" -> {
                FractionArithmetic();
            }
            default -> {
                System.out.printf("'%s' - Invalid command!", choice);
            }
        }
    }

    /**
     * Метод выполняет арифметические действия с комплексными числами
     */
    public void ComplexNumberArithmetic() {
        ComplexNumber first = new ComplexNumber();
        ComplexNumber second = new ComplexNumber();
        ComplexNumber result = new ComplexNumber();
        Scanner scan = new Scanner(System.in);
        first = first.GetComplexNumber();
        second = second.GetComplexNumber();
        System.out.println("Enter action - *, /, +, - ");
        String operator = scan.nextLine();
        switch (operator) {
            case "*" -> {
                result.Mul(first, second);
            }
            case "/" -> {
                result.Div(first, second);
            }
            case "+" -> {
                result.Add(first, second);
            }
            case "-" -> {
                result.Sub(first, second);
            }
            default -> {
                System.out.printf("'%s' - Invalid command!", operator);
            }

        }
    }

    /**
     * Метод выполняет арифметические действия с дробями
     */
    public void FractionArithmetic() {
        Fraction first = new Fraction();
        Fraction second = new Fraction();
        Fraction result = new Fraction();
        Scanner scan = new Scanner(System.in);
        first = first.GetFraction();
        second = second.GetFraction();
        System.out.println("Enter action - *, /, +, - ");
        String operator = scan.nextLine();
        switch (operator) {
            case "*" -> {
                result.Mul(first, second);
            }
            case "/" -> {
                result.Div(first, second);
            }
            case "+" -> {
                result.Add(first, second);
            }
            case "-" -> {
                result.Sub(first, second);
            }
            default -> {
                System.out.printf("'%s' - Invalid command!", operator);
            }

        }
    }


}
