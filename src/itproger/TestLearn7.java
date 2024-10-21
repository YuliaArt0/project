package itproger;

public class TestLearn7 {

  public static void main(String[] args) {
//    Циклы
//    Это специалые конструкции за счёт которых мы можем выполнять код несколько раз
//    подряд причем количество выполняемых раз мы можем указывать самостоятельно
//    В языке Java существует несколько основных типов циклов
//    Начнем с цикла for
//    изначально необходимо прописать ключевое слово for()
//    внутри круглых скобок указываются абсолютно все условия
//    изначально внутри форм необходимо создать некую переменную
//    и указать ей какое то первоначальное значение i = 0
//    далее ставим ; что говорит, вот у нас есть первое действие в этом цикле,
//    второе действие это будет условие, которое будет выполняться до тех пор пока переменная
//    будет меньше или равно 10 (i <= 10)
//    третье условие это мы должны указать каким образом наша переменная будет изменяться
// если не указать третье условие, то цикл будет бесконечный,
// переменная никогда не дойдет до числа 10, соотвественно цикл будет выполняться,
// что приведет к фатальному завершению программы
//    i++ переменная просто будет увеличиваться на единицу
//    for (int i = 0; i <= 10; i++) {
//      System.out.println("Element: " + i);
//  for (float i = 100; i > 10; i /= 2 ) {
//    System.out.println("Element: " + i);
//    }

//    Существует цикл while() - принцип работы тот же самый
//    то есть мы берем и выполняем некий код несколько раз подряд
//    цикл while отличается от for тем,
//    что здесь идет разный формат записи всех условий
//    Например создаем некую переменную дать ей значение 0
//    далее в цикле while указываем само по себе условие

//    int i = 1;
//    while (i <= 10) {
// До тех пор пока i < 10 у нас цикл будет выполняться
//      System.out.println("Element: " + i);
//      i++;

//      Существует ещё цикл do while, по сути это тот же самый цикл while
//      только разница заключается в том, что в цикле while мы изначально
//      проверяем само условие, если условие оказывается верным, то мы выполняем
//      тот код который находится внутри цикла, если условие неверное,
//      то и код мы выполнять не будем
//      а в цикле do while мы всегда обязательно один раз 100% выполняем код
//      который находится внутри цикла, далее мы проверяем условие, если условие оказывается
//      неверным то больше мы не выполняем само тело цикла, если условие верное
//      то мы дальше продолжаем выполнять сам цикл
//
//      изначально создадим переменную, укажем ей значение

//      int i = 100;
//      do {
//        System.out.println("Element: " + i);
//        i *= 100;
//        здесь мы указали неверный цикл
//      } while (i < 10);
//    }
//  int i = 0;
//      do {
//    System.out.println("Element: " + i);
//    i ++;
//  } while (i < 10);
//}
// Операторы внутри цикла break

    for (int i = 5; i < 25; i += 2) {
//      предположим, что хотим
//      выходить из цикла как только достигнем числа 17
      if (i % 3 == 0)
        continue;

      if (i >= 17)
//        чтобы выйти из цикла используют оператор break;
//        break;
      System.out.println("Element: " + i);
    }
//    по мимо оператора break существует оператор continue
//    в отличие от break он просто пропускает одну итерацию
//    или другими словами он пропускает один круг цикла


  }

}