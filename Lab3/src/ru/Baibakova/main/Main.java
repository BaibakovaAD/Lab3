package ru.Baibakova.main;
import java.util.Scanner;
import ru.Baibakova.fraction.Fraction;
import ru.Baibakova.fraction.Fraction3;
import ru.Baibakova.fraction.Fraction4;
import ru.Baibakova.fraction.SimpleFraction;

import static ru.Baibakova.main.Degree.calculateDegree;

public class Main {
    public static void main(String[] args) {
        //Задача 1.4 Дроби, добавили final
        // Создание объектов Fraction
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(5, 6);

        // Демонстрация работы геттеров
        System.out.println("Fraction 1: " + fraction1);
        System.out.println("Numerator of Fraction 1: " + fraction1.getNumerator());
        System.out.println("Denominator of Fraction 1: " + fraction1.getDenominator());

        // Демонстрация арифметических операций
        Fraction sum = fraction1.add(fraction2);
        System.out.println("Sum: " + sum);

        Fraction difference = fraction1.subtract(fraction2);
        System.out.println("Difference: " + difference);

        Fraction product = fraction1.multiply(fraction2);
        System.out.println("Product: " + product);

        Fraction quotient = fraction1.divide(fraction2);
        System.out.println("Quotient: " + quotient);

        // Использование сеттеров для изменения значений дроби
        fraction1.setNumerator(7);
        fraction1.setDenominator(8);
        System.out.println("Updated Fraction 1: " + fraction1);

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

        //Задача 3.1 то же самое, что и задача 1.4, поэтому можно будет только изменить везде Fraction на Fraction3
        // Проверка создания дробей и корректного сокращения
        System.out.println("\n Задача 3.1 Сложение дробей \n");
        Fraction3 fraction3 = new Fraction3(2, 4);
        Fraction3 fraction4 = new Fraction3(3, 9);
        System.out.println("fraction1 (должна быть 1/2): " + fraction3);
        System.out.println("fraction2 (должна быть 1/3): " + fraction4);

        // Проверка сложения дробей
        Fraction3 sum1 = fraction3.add(fraction4);
        System.out.println("Сумма 1/2 + 1/3 (должна быть 5/6): " + sum1);

        // Проверка вычитания дробей
        Fraction3 difference1 = fraction3.subtract(fraction4);
        System.out.println("Разность 1/2 - 1/3 (должна быть 1/6): " + difference1);

        // Проверка умножения дробей
        Fraction3 product1 = fraction3.multiply(fraction4);
        System.out.println("Произведение 1/2 * 1/3 (должно быть 1/6): " + product1);

        // Проверка деления дробей
        Fraction3 quotient1 = fraction3.divide(fraction4);
        System.out.println("Частное 1/2 / 1/3 (должно быть 3/2): " + quotient1);

        // Проверка работы с отрицательными значениями
        Fraction3 negativeFraction1 = new Fraction3(-2, 4);
        System.out.println("Отрицательная дробь -2/4 (должна быть -1/2): " + negativeFraction1);

        Fraction3 negativeDenominator1 = new Fraction3(2, -4);
        System.out.println("Дробь с отрицательным знаменателем 2/-4 (должна быть -1/2): " + negativeDenominator1);

        // Проверка работы с целыми числами
        Fraction3 addInteger1 = fraction3.add(1);
        System.out.println("1/2 + 1 (должно быть 3/2): " + addInteger1);

        Fraction3 subtractInteger1 = fraction3.subtract(1);
        System.out.println("1/2 - 1 (должно быть -1/2): " + subtractInteger1);

        Fraction3 multiplyInteger1 = fraction3.multiply(3);
        System.out.println("1/2 * 3 (должно быть 3/2): " + multiplyInteger1);

        Fraction3 divideInteger1 = fraction3.divide(2);
        System.out.println("1/2 / 2 (должно быть 1/4): " + divideInteger1);

        // Проверка ошибки деления на ноль
        try {
            Fraction3 zeroDenominator1 = new Fraction3(1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании дроби с нулевым знаменателем: " + e.getMessage());
        }

        try {
            fraction3.divide(new Fraction3(0, 1));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при делении на дробь с нулевым числителем: " + e.getMessage());
        }

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
