package itproger;

import java.util.Scanner;

public class PracticLearn6 {

  public static void main(String[] args) {
//    Условные конструкции if-else

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите роль: ");
    String role = scanner.nextLine();
//    Для проверки равенства админ, нам нужно не использовать ><, а использовать метод equals
      System.out.print("Введите пароль: ");
      String pass = scanner.nextLine();
    if (role.equals("Admin") && pass.equals("12345")) {
      System.out.println("Все пользователи");
    } else {
      System.out.println("Привет, как вас зовут?");
      String name = scanner.nextLine();
    }
  }
}
