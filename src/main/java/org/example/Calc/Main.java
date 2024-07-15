package org.example.Calc;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);

        /*
        int c в методе apply мы делим a и b, если b будет = 0, то выбрасывается исключение
        java.lang.ArithmeticException.
        Для этого в классе Calculator необходимо перехватить исключение с сообщение "Делить на ноль нельзя"
         */
    }
}