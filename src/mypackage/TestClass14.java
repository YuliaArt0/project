package mypackage;

public class TestClass14 {

  // Некоторые операции, котоыре мы можем производить над переменными
  public static void main(String[] args) {
    int a;

    // Операция присваивания делается с помощью знака =
    a = 10;

    // Чтобы перезаписать и присвоить новое значение мы следом можем написать новое значение

    a = 20;
    System.out.println(a);

    // Также мы можем в переменной зачение другой переменной для этого:

    int b = a;
    System.out.println(b);

    // Также можно присвоить значение сразу нескольким переменным

    int c, d;

    c = d = b;

    System.out.println(c + " " + d);

    // Арифметические операции

    a = 13;

    b = 5;

    System.out.println();
    System.out.println(a + b);

    System.out.println(a - b);

    System.out.println(a * b);

    System.out.println(a / b);

    //Чтобы получить дробное число нужно использовать

    double e = 15;
    double f = 7;

    System.out.println(e / f);

    // Чтобы получить остатка от деления нужно использовать знак %
    System.out.println(a % b);

    a = b + c * d;

    System.out.println(a);

    // Приоритеты операции - совпадают с приоритетами операциями в математике, сначала идет умножение и деление, а потом сумма сложение и вычетание

    //  Если мы хотим изменить приоритет операции, мы должны использовать скобки

    a = (b + c) * d;

    System.out.println(a);

    // Операции сравнения

    a = 15;

    b = 10;

    System.out.println();
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a - 5 >= b);
    System.out.println(a - 5 <= b);

    // == означает равенство != означает не ровно

    System.out.println(a == b);
    System.out.println(a != b);

    System.out.println(a + 10 <= b + 15);

    // Операции отрицания

    System.out.println(!(a + 10 <= b + 15));

    // Если мы добавляем ! мы меняем результат на противоположный

    System.out.println(!(false));

    // Инкремент, i++ это тоже самое что i = i+1

    int i = 0;
    i++;
    System.out.println(i);

    // Декремент, i-- это тоже самое  что i = i - 1

    i--;
    System.out.println(i);

    // Префиксная и Постфиксная форма,
    // у постфиксной формы знак ++ или -- указывается после переменной как тут i++
    // Также их можно указывать перед переменной в чем разница

    i = 5;
    System.out.println();
    System.out.println(i++);
    System.out.println(i);

    // здесь мы используем префиксную запись

    i = 3;
    a = i++;
    System.out.println(a);

    // Если мы хотим изменить порядок прибавления к трем единицы, то

    i = 3;
    a = ++i;
    System.out.println(a);

    // Операции boolean - это операции которые возвращают true или false как операции сравнения

    a = 10;
    b = 20;

    // || Это операция ИЛИ,
    // она возвращает true в случае если хотя бы одна из частей, которые связывет или тоже возвращает true

    System.out.println();
    System.out.println(a > b || a < b);
    System.out.println(a > b || b > 30);

    // Операция И, описывается с помощью двух имперсантов &&
    // Таким образом если a больше чем b и a меньше чем b, тогда мы получим true
    // Операция И вернет нам true если оба выражения вернут true

    System.out.println(a > b && a < b);

    System.out.println(a > 9 && b == 20);


    // Сначала приоритет имеет арифметические операции, дальше это выражение сравнится с 15
    // Далее из б вычится 5 и сравнится с 10, далее сравнится а с б
    // После этого по приоритету идет операция И сравнится  b - 5 > 10 && a < b
    // В дальнейшем полученное выражение со знаком И сравнится с ИЛИ a + 10 > 15

    System.out.println(a + 10 > 15 || b - 5 > 10 && a < b);

    // Далее к итоговому числу применем знак отрицания

    System.out.println(!(a + 10 > 15 || b - 5 > 10 && a < b));

    // Операции с синусами, косинусами, корнями для этого используем класс масс

    a = 9;
    System.out.println(Math.sqrt(a)); // вычислили корень из 9

    System.out.println(Math.pow(a, 3)); // возведем число в степень

    // Комбинированные операции - совмещают в себе операции присваивания
    // И какие нибудь арифметические операции

    a = 10;
    a = a + 5;
    System.out.println();
    System.out.println(a);
    // Эти операции выглядят достаточно грамозко и для упращения используются
    // комбинированные операции

    a = 10;
    a +=5; // эта запись идентична a = a + 5;
    System.out.println();
    System.out.println(a);

    a -= 5; // эта запись идентична a = a - 5;
    System.out.println();
    System.out.println(a);
    a *= 2; // эта запись идентична a = a * 2;
    System.out.println();
    System.out.println(a);
    a /= 2; // эта запись идентична a = a / 2;
    System.out.println();
    System.out.println(a);

    a %= 3; // эта запись идентична a = a % 2; остаток от деления
    System.out.println();
    System.out.println(a);
  }
}
