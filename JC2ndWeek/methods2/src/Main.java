import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Bugün programlamada hangi konuyu öğrendiniz?");
String text = scan.nextLine();
System.out.println(konu(text));

    }
   public static String konu(String metin){
       String message = " konusunu öğrendim";
       return metin + message;
    }
}