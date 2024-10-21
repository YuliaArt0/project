package mypackage;

import java.sql.SQLOutput;

public class TestClassByte {

  public static void main(String[] args) {
//Целочисленные значения переменных
    byte a = 5; //- 128 127
    short b = -100; //-32768 32767
    int c;
    c = 1000000;
    long d = -122335544;

    System.out.println(a);
    System.out.println("short b: " + b);
    System.out.println("int c: " + c);
    System.out.println("long d: " + d);

//Вещественные значения переменных
    double double1 = 133.155;
    System.out.println();
    System.out.println("double double1:" + double1);
    float float1 = 150.32f;
    System.out.println(float1);

//Хранит в себе одно из значений, либо true, либо false
    boolean boolean1 = true;
    boolean boolean2 = false;

    System.out.println(boolean1);
    System.out.println(boolean2);

    boolean boolean3 = 1 + 2 > 0;
    boolean boolean4 = 1 + 2 > 5;
    System.out.println();
    System.out.println(boolean3);
    System.out.println(boolean4);

//Переменные данного типа могут хранить в себе строки (строковые значения)
    String str = "Hello";
    String str2 = "World!";
    String str3 = str + " " + str2;
    System.out.println();
    System.out.println(str3);

//Переменная типа char может хранить в себе только ОДИН символ
    char char1 = 'g';
    System.out.println(char1);

  }
}
