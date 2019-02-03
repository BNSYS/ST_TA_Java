package ru.stqa.st_ta_java.sandbox;

/*
For demo
*/
class BlockDemo {
  public static void main(String args[]) {
    countToFive();
    System.out.println("Ready");
    System.out.println(isBelowZeroCelsius(280));
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