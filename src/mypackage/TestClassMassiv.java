package mypackage;

public class TestClassMassiv {
// Массив это объект, который хранит в себе множество ячеек
// в каждую из ячеек мы можем положить какое то из значений, но при этом все значения должны быть одного типа

//  например нам нужно хранить множество каких то имен

  public static void main(String[] args) {

    String[] names;
    names = new String[3];
    String[] name = new String[3];
    int[] arr = new int[10];
// Индексация в массивах идет с 0 (не с 1)
    name[0] = "Vasya";
    name[1] = "Petya";
    name[2] = "Vanya";

    System.out.println(name[0]);
    System.out.println(name[2]);

    arr[3] = 15;
    arr[3] = 10;
    System.out.println(arr[3]);

    int[] array = {15, 10, 100, 9, 44};

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println();
//    Добавим пример цикла

    for (int i = 0; i < 5; i++){

      System.out.println(array[i]);
    }

    int[] arr2 = new int[15];

    System.out.println();

    for (int j = 0; j < 15; j++){
      arr2[j] = j * 10;
      System.out.println(arr2[j]);
    }

    System.out.println();
    System.out.println(arr2.length);

    System.out.println(arr2[arr2.length - 1]);



  }
}
