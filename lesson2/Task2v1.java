package lesson2;
//Урок 2 задача 2
/*
Введите с клавиатуры целые числа a и b. Выведите на экран результат сравнения:

a3 > b2,       где a3 - a в кубе, b2 - b  в квадрате
 */
import java.util.Scanner; // импортируем класс сканер
public class Task2v1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // подключаем класс сканера

        System.out.println("Произвидём сравнение по нашей волшебной формуле :)");
        System.out.print("Введите значение а: ");
        double a = in.nextDouble();   // ловим первую переменную целого числа введённую в консоль
        System.out.print("Введите значение b: ");
        double b = in.nextDouble(); // ловим вторую переменную целого числа введённую в консоль

        in.close(); // закрыл сканер
        a = Math.pow(a,3);
        b = Math.pow(b,2);
        if (a>b) {

            System.out.println("Значение а: "+ a + " больше, чем b: " + b);
        }
        else
        {

            System.out.println("Значение а: "+ a + " меньше, чем b: " + b);
        }



    }

}
