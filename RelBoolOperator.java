public class RelBoolOperator {
  public static void main(String[] args) {
    int i = 42;
    String s = (i < 40) ? "Life" : (i > 50) ? "Universe" : "Everything";
    System.out.println(s);
  }
}