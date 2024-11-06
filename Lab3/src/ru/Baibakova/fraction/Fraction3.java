package ru.Baibakova.fraction;
public final class Fraction3 {
    private final int numerator;   // Числитель
    private final int denominator; // Знаменатель

    // Конструктор, принимающий числитель и знаменатель
    public Fraction3(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        // Проверка и упрощение дроби сразу при создании
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        // Обеспечиваем, что только числитель может быть отрицательным
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Метод для получения строкового представления дроби
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод для сложения двух дробей
    public Fraction3 add(Fraction3 other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction3(newNumerator, newDenominator);
    }

    // Метод для вычитания двух дробей
    public Fraction3 subtract(Fraction3 other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction3(newNumerator, newDenominator);
    }

    // Метод для умножения двух дробей
    public Fraction3 multiply(Fraction3 other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction3(newNumerator, newDenominator);
    }

    // Метод для деления двух дробей
    public Fraction3 divide(Fraction3 other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Нельзя делить на ноль.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction3(newNumerator, newDenominator);
    }

    // Метод для сложения дроби с целым числом
    public Fraction3 add(int number) {
        return add(new Fraction3(number, 1));
    }

    // Метод для вычитания целого числа из дроби
    public Fraction3 subtract(int number) {
        return subtract(new Fraction3(number, 1));
    }

    // Метод для умножения дроби на целое число
    public Fraction3 multiply(int number) {
        return multiply(new Fraction3(number, 1));
    }

    // Метод для деления дроби на целое число
    public Fraction3 divide(int number) {
        return divide(new Fraction3(number, 1));
    }

    // Нахождение наибольшего общего делителя
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
