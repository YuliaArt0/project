package itproger;

public class TestLearn12 {

  public static void main(String[] args) {
//  ООП на практике: классы и объекты
//    Мы создали конкретный объект машину бмв
//    Car bmw = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0});
//    bmw.engine.setValues(false, 2000);
//    bmw.engine.info();
////    прописали все значения харнактеристик
////    bmw.setValues(250.5f, 2500, "White", new byte[] {0, 0, 0});
////    String res1 = bmw.getValues();
////    System.out.println(res1);
////    bmw.speed = 250.5f;
////    bmw.weight = 2500;
////    bmw.color = "White";
////    bmw.coordinate = new byte[] {0, 0, 0};
////    Transport transport = new Transport(250.5f, 2500, "White", new byte[] {0, 0, 0});
//
//    Truck truck = new Truck(5600, new byte[] { 100, 0, 100 }, false);
//    truck.engine.setValues(true, 500);
//    truck.engine.info();
//    truck.setValues(250.5f, 2500, "White", new byte[] {0, 0, 0}, true);
//    System.out.println(truck.getValues());
//    truck.speed = 140.5f;
//    truck.weight = 5600;
//    truck.color = "Red";
//    truck.coordinate = new byte[] { 100, 0, 100 };
//
//    String res2 = truck.getValues();
//    System.out.println(res2);
//    System.out.print("Truck speed: " + truck.speed + " " + "BMW speed: " + bmw.speed);

//  truck.setLoaded(true);
//  truck.getLoaded();

//    Анонимный класс
    Car flyCar = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0}) {
      @Override
      public void moveObject(float speed) {
        super.moveObject(speed);

        this.engine.isReady(true);
        System.out.println("Машина летит");
      }
    };

    flyCar.moveObject(450);
  }

}
