package ru.Baibakova.main;

public class Fraction5 extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction5(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
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

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Реализация методов класса Number для различных представлений дроби
    @Override
    public int intValue() {
        return numerator / denominator; // Целая часть
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    // Метод для преобразования дроби в вещественное число
    public double toDouble() {
        return (double) numerator / denominator;
    }

    public static double sumNumbers(Number... numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            if (number instanceof Integer) {
                sum += (Integer) number;
            } else if (number instanceof Double) {
                sum += (Double) number;
            } else if (number instanceof Fraction5) {
                sum += ((Fraction5) number).toDouble();
            } else {
                throw new IllegalArgumentException("Неподдерживаемый тип: " + number.getClass().getName());
            }
        }
        return sum;
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
