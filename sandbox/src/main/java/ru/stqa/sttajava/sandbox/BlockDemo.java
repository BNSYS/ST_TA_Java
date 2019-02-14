package ru.stqa.sttajava.sandbox;

/*
For demo
*/
class BlockDemo {
  public static void main(String args[]) {
    Square s = new Square();

    countToFive();
    System.out.println("Ready");
    System.out.println(isBelowZeroCelsius(280));



  }
  public static double area (Square s){
    return s.len * s.len;
  }
  public static double area (Square a, Square b){
    return s*b;
  }

  public static void countToFive () {
    int count;
    for (count = 0; count < 5; count++) {
      System.out.println("Counter value: " + count);
      System.out.println("NotReady");
    }
  }

  public static boolean isBelowZeroCelsius(double kelvin){
    return !(kelvin < 273);
  }
}