package itproger;

import java.util.LinkedList;

public class CollectionsLinkedList9 {

  public static void main(String[] args) {
//    Коллекции в Java

    LinkedList<Float> numbers = new LinkedList<>();
    numbers.add(5.6f);
    numbers.add(15.26f);
    numbers.add(5.65345f);

    for (Float el : numbers)
    System.out.println(el);
  }

}
