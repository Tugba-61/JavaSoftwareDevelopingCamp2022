import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String message = "Today the whether is very beautiful";
        System.out.println(message);
       System.out.println("number of elements: "+message.length());
System.out.println("Fifth element is: "+message.charAt(4));
System.out.println(message.concat("long live!"));
/*concat, kullanıldığında yeni bir string oluşturur.
 Dolayısıyla "message stringi" alt satırda yeniden yazıldığında tanımlanan ilk haliyle gelir.
 Birleştirdiğimiz metni kullanmak istiyorsak değişkene atamalıyız.*/
System.out.println(message.startsWith("T"));
/*String dizisi tırnak içinde yazan harfle başlıyorsa true, değilse false döndürür.
Java, case sensitive yani büyük-küçük harf duyarlı bir dildir.
 Dolayısıyla büyük harf yerine küçük harf kullanırsak false döndürecektir.*/
System.out.println(message.endsWith("l"));
char[] karakterler = new char[5];
message.getChars(0,5,karakterler,0);
System.out.println(karakterler);
System.out.println(message.indexOf('a'));
//Baştan başlayarak ilk 'a' karakterinin sırasını verir.
System.out.println(message.indexOf("ay"));
System.out.println(message.lastIndexOf('e'));
//En sondaki 'e' karakterinin sırasını verir.
System.out.println(message.replace(' ','-' ));
//Yeni bir metin oluştuğu için kullanılmak istendiğinde değişkene atanmalıdır.
System.out.println(message.substring(2));
//message stringini 2. indexten itibaren yazdırır.
System.out.println(message.substring(2,4));
//2.(dahil) indexten 4.(dahil değil) indexe kadar yazdırır.
for(String kelime : message.split(" "))
System.out.println(kelime);
System.out.println(message.toLowerCase());
//message stringinin içindeki bütün harfleri küçük harf olarak yazdırır.
System.out.println(message.toUpperCase());
//message stringinin içindeki bütün harfleri büyük harf olarak yazdırır.
  System.out.println(message.trim());
  //Metnin başındaki ve sonundaki gereksiz boşlukları atar.

    }
}