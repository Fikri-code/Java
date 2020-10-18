public class Foreach {
  public static void main(String[] args){
    int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };

    for(int x : smallPrimes) {
      System.out.println(x);
    }
  }
}