package ru.Baibakova.main;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Degree {

    // Метод возводит число X в степень Y, полученные в виде строк
    public static double calculateDegree(String xStr, String yStr) {
        int x = parseInt(xStr);    // Преобразуем строку X в целое число
        int y = parseInt(yStr);    // Преобразуем строку Y в целое число
        return pow(x, y);          // Возводим X в степень Y
    }

    //MAIN!!!
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Пожалуйста, введите два числа X и Y в качестве аргументов командной строки.");
            return;
        }

        try {
            // Вызываем метод calculateDegree с аргументами командной строки
            double result = calculateDegree(args[0], args[1]);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Пожалуйста, введите корректные целые числа.");
        }
    }
}
