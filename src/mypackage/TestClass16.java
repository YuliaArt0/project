package mypackage;

public class TestClass16 {

  // Условные операторы if else, операторы выбора switch
  // условия - это некая конструкция,
  // которая позволяет разветвлить нашу программу в зависимости от каких либо условий
  // если мы хотим произвести какие-то действия в зависимости от того или иного исхода событий
  // мы можем использовать конструкцию if
  public static void main(String[] args) {

    int i = 4;

    // пишем условие,
    // чтобы в дальнейшем программа выполнялась в зависимости от его выполнения
    System.out.println("Start of program");

    if (i > 10) {
      System.out.println("i > 10");  // если i больше чем 5 то на экран выведется сообщение
      i++;
      System.out.println(i);
    } else if (i < 10 && i
        > 5) { // расширим данную конструкцию с помощью оператора else,  какие команды будут выполняться если условия не выполнятся

      System.out.println("i < 10 and i > 5");
      i--;
      System.out.println(i);
    } else {
      System.out.println("Nothing");
    }

    System.out.println("End of program");

    System.out.println(); // вложенные условия

    i = 95;

    if (i > 50) {
      System.out.println("i > 50");

      if (i > 90) {
        System.out.println("i > 90");
      } else {
        System.out.println("i <= 90");
      }
    } else {
      System.out.println("i <= 50");
    }

    // Switch оператор множественного выбора отличия от if
    // мы проверяем не какие-то условия, а равенства на конкретное значение


    i = 10;

    switch (i) { // в данном случаемы проверяем чему равна переменная i,
      // далее мы открываем фигурные скобки, в них мы пишем различные слова кейс с какими то значениями
      // которым может быть равна переменная i
      // если кейс 1 равна единице, то мы пишем список команд, которые должны выполняться в таком случае
      case 1:
        System.out.println("Then number is 1");
        break; // чтобы прервать данную проверку
      case 2:
        System.out.println("The number is 2");
        break;
      case 3:
        System.out.println("The number is 3");
        break;
      default: // дефолт некий аналог else, если не какое действие не подошло, то будет выполнено это условие
        System.out.println("I don't know the number");
    }

  }





}

