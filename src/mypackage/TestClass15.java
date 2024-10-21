package mypackage;

public class TestClass15 {

  public static void main(String[] args) {
// Поподробнее разобрать string и основные методы пезные для работы со строками

    // Заведем новую переменную типа string
    // Стринг это целый класс, при работе со строками, мы имеем дело с объектами

    // Отличия при работе с объектами от работы с примитивными типами
    // это их сравнение, если мы хотим сравнить строку с другой строкой
    // мы должны использовать метод equals

    String s = "Hello World!";

    // equals возвращает значение boolean, либо true, либо false
    System.out.println(s.equals("Hello World!"));
    // мы написали название переменной s, далее точка и название метода которые мы хотим вызвать
    // и в скобках указали входные параметры дляя этого метода
    System.out.println(s.equals("Hello!"));

    String s2 = "hello";

    System.out.println(s.equals(s2));

    // Так же для сравнения мы можем использовать equalsIgnorCase

    s = "text";
    s2 = "TEXT";

    System.out.println(s.equals(s2));

    System.out.println(s.equalsIgnoreCase(s2)); // когда игнорируем регистр выходит true

    s = "TeXt";
    System.out.println();
    System.out.println(s);
    System.out.println(s.toLowerCase()); // позволяет всю строку приобразовать всю строку в маленький регистр
    System.out.println(s.toUpperCase()); // позволяет всю строку приобразовать всю строку в большой регистр

    System.out.println();
    // к примеру мы хотим узнать какой символ находиться на втором месте строки - вызываем charAt
    System.out.println(s.charAt(1)); // мы можем по индексу получить индекс который находится в строке

    // Есть обратная операция indexOf мы можем найти индекс под строки которая называется Xt

    System.out.println(s.indexOf("Xt"));
    // Таким образом мы можем узнать индекс по тексту или текст по индексу

    s = "Hello, World!";
    System.out.println(s.contains("Hello")); // метод contains возвращает boolean значение true или false

    // и проверяет содержит ли строчку в себе какую то другую строку
    System.out.println(s.contains("text"));

    // Для того, чтобы узнать длину строки, мы можем использовать метод length
    System.out.println();
    System.out.println(s.length());

    // Методы со строками startsWith

    System.out.println();
    System.out.println(s.startsWith("He")); // проверяет начинается ли строка Hello, World на буквы He
    System.out.println(s.startsWith("!")); // проверяет начинается ли строка на !

    System.out.println(s.endsWith("He")); // проверяем окончание строки на He
    System.out.println(s.endsWith("!")); // проверяем окончание строки на !


    // разобъем строку используя какой то разделитель

    s = "hello,world";
    System.out.println();
    String[] array = s.split(",");
    // создадим массив элеменов стринг назвать его арэй и написать
    // чему он равен s.split в методе split написать чему он равен ,
    System.out.println(array[0] + "!" + array[1] + "!");
    // далее разобьем строку по отдельности
    System.out.println(array[0]);
    System.out.println(array[1]);

    // Метод формат - позволяет форматировать строчку

    String str = "My name is %s! I'm %d years old!";
    // мы создаем некий шаблон, но мы не знаем точное значение имени и количество лет возраста
    // по этому мы оставляем некоторое место куда наше значение вставится в будущем
    // %s - означает, что здесь будет строка, %d - здесь будет целое число

    int age = 30;
    String name = "Ivan";

    System.out.println(String.format(str, name, age));

    System.out.println(String.format(str, "Vasya", 10));

    // Рассмотрим метод класса Integer

    System.out.println();

    String age2 = "30"; // для того, чтобы извлечь из этой строки число
    // можно использовать метод парсинг, который вызывается через класс

    int a = Integer.parseInt(age2); // таким образом мы преобразуем строку 30 в число 30

    System.out.println(a * 3);

    s = "Hello, world!";

    System.out.println(s.substring(1, 5));
    // данный метод позволяет выделять подстроку из какой то строки
    // если мы хотим получить от какой то строки её часть, начиная со второй буквы и до пятой
    // в нем мы указываем начало и конец строки

    System.out.println(s.substring(7));
  // давайте укажем индекс 7

    System.out.println(s.substring(7, s.length()- 2)); // обрежем строку от 7 индекса и до последнего знака


    // метод для выполнения конкантенации строк - это объединение строках слияния

    String s1 = "Hello ";
    s2 = "world";
    String s3 = "!";
    String res;

    res = s1 + s2 + s3;
    System.out.println(res);

  // Однако для слияния строк есть специальный метод concat

    res = s1.concat(s2).concat(s3); // она лучше сказывается на производительности
    System.out.println(res);

  }
}
