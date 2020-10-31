import java.time.LocalDate;

public class LocalDateClass {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
    System.out.println(today);
    System.out.println(newYearsEve);
  }
}