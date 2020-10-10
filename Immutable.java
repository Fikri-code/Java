public class Immutable {
    public static void main(String[] args) {
      String greeting = "Hello";
      greeting = greeting.substring(0, 3) + "p!";

      System.out.println(greeting);
    }
    
}