public class EmptyString {
    public static void main(String[] args) {
      String str = "";
      if (str != null && str.length() != 0) {
        System.out.println(str);
      }
      else {
        System.out.println("String is Empty or Null");
      }
    }
    
}