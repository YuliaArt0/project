package itproger;

public abstract class Transport {

   public float speed;
   private int weight;
   private String color;
   private byte[] coordinate;

//   Создаем конструктор, в нем можем передавать какие-то параметры
   public Transport(float speed, int weight, String color, byte[] coordinate) {
//     При создание объекта Транспорт мы можем сразу выводить что то на экран
     System.out.println("Object created");
     setValues(speed, weight, color, coordinate);
//     System.out.println(getValues());
   }

   public Transport(int weight, byte[] coordinate) {
     this.weight = weight;
     this.coordinate = coordinate;
//     System.out.println(getValues());
   }

   public abstract void moveObject(float speed);
   public abstract boolean stopObject();

   protected void setValues(float speed, int weight, String color, byte[] coordinate) {
      this.speed = speed;
      this.weight = weight;
      this.color = color;
      this.coordinate = coordinate;

   }
    protected   String getValues() {
//      У нас есть переменная инфо и
//      в этой переменной у нас просто будут записаны все поля ,которые не являются массивом
 String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color + ".\n";
// Дополнительно мы создаем ещё одну переменную в ней прописывчаем просто слово Coordinates:
// а также выполняем перевод на новую строку \n
 String infoCoordinates = "Coordinates:\n";
// Далее мы создаем цикл, в этом цикле перебираем весь наш массив координат
//   далее к текущей нашей строке infoCoordinates мы добавляем каждый элемент
//   из самого этого массива + в конце делаем перевод на новую строку \n

   for(int i = 0; i < coordinate.length; i++)
      infoCoordinates += coordinate[i] + "\n";

   return info + infoCoordinates;
//   Здесь
}
// Создадим вложенный класс

  class Engine {

     private boolean isReady;
     private int km;

     public void setValues(boolean isReady, int km) {
       this.isReady = isReady;
       this.km = km;
     }

     public void isReady(boolean isReady) {
       this.isReady = isReady;
     }
     public void info() {
       if (isReady)
         System.out.println("Двигатель исправен");
       else {
         System.out.println("Нет, он не работает. Он проехал уже " + km + "км");
       }

     }
  }
}
