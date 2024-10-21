package itproger;

import java.util.Scanner;

public class TestLearn5 {

  public static void main(String[] args) {
//    System.out.println("Данные от пользователя");
//    Для получения данных от пользователя мы должны использовать класс Scanner
//Мы создали объект с помощью класса Scanner
// И через этот объект мы получаем данные
//  Выделели память под сканер и говорим, что мы будем их получать

    Scanner scan = new Scanner(System.in);
////Метод nextLine - мы получаем от пользователя некую информацию
//    System.out.print("Введите ваше имя: ");
////    вводим с помощью стринг некую переменную юзернэйм
//   String userName = scan.nextLine();
//    System.out.println("Привет, " + userName);

//    Если мы хотим получить от пользователя числа, то нужно использовать другой метод
//    nextInt - получаем от пользователя числовую информацию

//    int num1 = scan.nextInt();
//    byte num2 = scan.nextByte();
//    boolean b = scan.nextBoolean();
//
//    Математические операции, которые можно проводить в Java

//    Создаем калькулятор
    System.out.print("Введите 1 число: ");
    float num1 = scan.nextFloat();

    System.out.print("Введите 2 число: ");
    float num2 = scan.nextFloat();


    float res1 = num1 + num2;
    float res2 = num1 - num2;
    float res3 = num1 * num2;
    float res4 = num1 / num2;

    System.out.println("Результат: ");
    System.out.println(res1 + "\n" + res2 + "\n"+ res3 + "\n" + res4 + "\n");

  }

}
