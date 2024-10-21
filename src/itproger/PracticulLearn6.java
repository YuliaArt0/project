package itproger;

import java.util.Scanner;

public class PracticulLearn6 {
//  Практика с условными конструкциями switch - case
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int num = scanner.nextInt();
  switch (num) {
    case 1:
      System.out.println("Number is 1");
      break;
    case 2:
      System.out.println("Number is 2");
      break;
    case 5:
      System.out.println("Number is 5");
      break;
    case 10:
      System.out.println("Number is 10");
      break;
    default:
      System.out.println("Default");
//      В switch - case мы всегда проверяем на четкое значение
//    на четкое совпадение
//    Так же в конце конструкции мы прописываем break, это означает выйти из switch-case;
//    еще в этих операторах, есть оператор default
//    default это по сути тот же оператор else только в операторах switch - case

  }
}

}
