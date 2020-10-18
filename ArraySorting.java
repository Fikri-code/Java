import java.util.Arrays;

public class ArraySorting {
  public static void main(String[] args) {
    int[] smallPrimes = { 14, 9, 11, 8, 1, 20, 18 };
    Arrays.sort(smallPrimes);
    for (int i = 0; i <= smallPrimes.length; i++) {
      System.out.println(smallPrimes[i]);
    }
  }
}