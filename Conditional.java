public class Conditional {
  public static void main(String[] args) {
    int nilai = 90;

    if (nilai >= 80) {
      System.out.println("A");
    }
    else if (nilai >= 70 && nilai <= 79) {
      System.out.println("B");
    }
    else {
      System.out.println("C");
    }
  }
}