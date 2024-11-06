package ru.Baibakova.main;
import java.util.Arrays;
import java.util.Scanner;
import ru.Baibakova.fraction.Fraction;
import ru.Baibakova.fraction.Fraction4;
import ru.Baibakova.fraction.SimpleFraction;

import static ru.Baibakova.main.Degree.calculateDegree;

public class Main {
    public static void main(String[] args) {
        //Задача 1.4 Дроби, добавили final
        // Проверка создания дробей и корректного сокращения
        System.out.println("Задача 1.4 Сложение дробей \n");
        Fraction fraction1 = new Fraction(2, 4);
        Fraction fraction2 = new Fraction(3, 9);
        System.out.println("fraction1 (должна быть 1/2): " + fraction1);
        System.out.println("fraction2 (должна быть 1/3): " + fraction2);

        // Проверка сложения дробей
        Fraction sum = fraction1.add(fraction2);
        System.out.println("Сумма 1/2 + 1/3 (должна быть 5/6): " + sum);

        // Проверка вычитания дробей
        Fraction difference = fraction1.subtract(fraction2);
        System.out.println("Разность 1/2 - 1/3 (должна быть 1/6): " + difference);

        // Проверка умножения дробей
        Fraction product = fraction1.multiply(fraction2);
        System.out.println("Произведение 1/2 * 1/3 (должно быть 1/6): " + product);

        // Проверка деления дробей
        Fraction quotient = fraction1.divide(fraction2);
        System.out.println("Частное 1/2 / 1/3 (должно быть 3/2): " + quotient);

        // Проверка работы с отрицательными значениями
        Fraction negativeFraction = new Fraction(-2, 4);
        System.out.println("Отрицательная дробь -2/4 (должна быть -1/2): " + negativeFraction);

        Fraction negativeDenominator = new Fraction(2, -4);
        System.out.println("Дробь с отрицательным знаменателем 2/-4 (должна быть -1/2): " + negativeDenominator);

        // Проверка работы с целыми числами
        Fraction addInteger = fraction1.add(1);
        System.out.println("1/2 + 1 (должно быть 3/2): " + addInteger);

        Fraction subtractInteger = fraction1.subtract(1);
        System.out.println("1/2 - 1 (должно быть -1/2): " + subtractInteger);

        Fraction multiplyInteger = fraction1.multiply(3);
        System.out.println("1/2 * 3 (должно быть 3/2): " + multiplyInteger);

        Fraction divideInteger = fraction1.divide(2);
        System.out.println("1/2 / 2 (должно быть 1/4): " + divideInteger);

        // Проверка ошибки деления на ноль
        try {
            Fraction zeroDenominator = new Fraction(1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании дроби с нулевым знаменателем: " + e.getMessage());
        }

        try {
            fraction1.divide(new Fraction(0, 1));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при делении на дробь с нулевым числителем: " + e.getMessage());
        }

        //Задача 3.3 то же самое, что и задача 1.4, поэтому можно будет только изменить везде Fraction на Fraction3

        //Задача 4.2 Fraction4 абстрактный класс, подтип класса Number
        System.out.println("\nЗадача 4.2 Дробь это число \n");
        Fraction4 shot1 = new SimpleFraction(1, 2);
        Fraction4 shot2 = new SimpleFraction(3, 4);

        System.out.println("Дробь 1: " + shot1);
        System.out.println("Дробь 2: " + shot2);

        System.out.println("Целочисленное деление " + shot1 + " в intValue выглядит как: " + shot1.intValue());
        System.out.println("Целочисленное деление " + shot1 + " в longValue выглядит как: " + shot1.longValue());
        System.out.println("Деление с приведением к десятичной дроби из " + shot1 + " в floatValue: " + shot1.floatValue());
        System.out.println("Деление с приведением к десятичной дробииз " + shot1 + " в doubleValue: " + shot1.doubleValue());

        System.out.println("Целочисленное деление " + shot2 + " в intValue выглядит как: " + shot2.intValue());
        System.out.println("Целочисленное деление " + shot2 + " в longValue выглядит как: " + shot2.longValue());
        System.out.println("Деление с приведением к десятичной дроби из " + shot2 + " в floatValue: " + shot2.floatValue());
        System.out.println("Деление с приведением к десятичной дробииз " + shot2 + " в doubleValue: " + shot2.doubleValue());

        //Задача 5.1 Добавили метод на сложение дробей
        System.out.println("\nЗадача 5.1 Сложение дробей \n");
        // Сложение: 2 + 3/5 + 2.3
        double result1 = Fraction5.sumNumbers(2, new Fraction5(3, 5), 2.3);
        System.out.println("2 + 3/5 + 2.3 = " + result1);

        // Сложение: 3.6 + 49/12 + 3 + 3/2
        double result2 = Fraction5.sumNumbers(3.6, new Fraction5(49, 12), 3, new Fraction5(3, 2));
        System.out.println("3.6 + 49/12 + 3 + 3/2 = " + result2);

        // Сложение: 1/3 + 1
        double result3 = Fraction5.sumNumbers(new Fraction5(1, 3), 1);
        System.out.println("1/3 + 1 = " + result3);

        //Задача 7.3 Возведение в степень
        Scanner scanner = new Scanner(System.in);
        Main methods = new Main();
        System.out.println("\nЗадача 7.3 Возведение в степень\n");

        System.out.print("Введите число, которое будет возводиться в степень: ");
        String x = scanner.nextLine();
        System.out.print("Введите степень: ");
        String y = scanner.nextLine();

        String[] numbers = new String[2];
        numbers[0] = x;
        numbers[1] = y;

        try {
            // Вызываем метод calculateDegree с аргументами командной строки
            double result = calculateDegree(numbers[0] , numbers[1] );
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Пожалуйста, введите корректные целые числа.");
        }
    }
}
