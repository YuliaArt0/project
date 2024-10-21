package itproger;

import java.util.ArrayList;

public class TestLearn9Collections {

  public static void main(String[] args) {
//    Коллекции в Java
//  Набор связанных между собой классов для реализации
//    структуры данных другими
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(50);
    numbers.add(1, 30);

//    System.out.println(numbers.size());
    System.out.println(numbers.get(1));
//   Удалить один элемент по индексу
    numbers.remove(1);
//Удалить все элементы из списка
//    numbers.clear();

    for (Integer el : numbers) {
      System.out.println(el);
    }
  }

}
