//Задание 1 
//На месте комментария написать код, который присвоит переменной a значение переменной b и наоборот.
//реализовать задачу, НЕ используя третью переменную.
public class Task1v1 {

     public static void main(String[] args) {

        int a = 5;

        int b = 10;
        
        a = a + b;  //
        b = a - b;  // место для вашего кода
        a = a - b;  // место для вашего кода
        System.out.println("Значение а: " + a + ". Значение b: " + b);
        /* Еще один вариант решения
        a = a + b - (b = a); 
        System.out.println("Значение а: " + a + ". Значение b: " + b);
        */
    }

}
