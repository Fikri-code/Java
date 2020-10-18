import java.util.Scanner;
import java.nio.file.Paths;
import java.io.*;

public class FileInputOutput {
  public static void main(String[] args) throws IOException {
    //untuk membuat file
    PrintWriter out = new PrintWriter("C:\\Users\\Fikri\\Documents\\Tugas Sekolah\\Java\\myfile.txt", "UTF-8");
    
    // untuk membaca file dan menampilkannya ke console
    Scanner in = new Scanner(Paths.get("C:\\Users\\Fikri\\Documents\\Tugas Sekolah\\Java\\mytext.txt"), "UTF-8");
    String isiFile = in.nextLine();
    System.out.println(isiFile);
  }
}