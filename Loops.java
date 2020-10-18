public class Loops {
  public static void main(String[] args) {
    int balance = 1;
    int goal = 20;
    int years = 0;
    while (balance < goal) {
      System.out.println(balance + " balance.");
      balance += years;
      years++;
    }
  }
}