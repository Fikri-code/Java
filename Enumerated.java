public class Enumerated {
    enum Size{ SMALL, MEDIUM, LARGE, EXTRA_LARGE};
    public static void main(String[] args) {
        
        Size s;
        s = Size.EXTRA_LARGE;
        System.out.println("s = " + s);
        
    }
    
}