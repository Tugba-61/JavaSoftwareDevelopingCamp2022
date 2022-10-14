import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Ortalamasını almak istediğiniz 3 tam sayı giriniz.");
double num1 = scan.nextDouble();
double num2 = scan.nextDouble();
double num3 = scan.nextDouble();
System.out.println("Girdiğiniz sayılar: "+num1+" " +num2+" "+num3);

  System.out.println("Girdiğiniz 3 Sayının aritmetik ortalaması:  "+aritmetikOrtalamaBul(num1,num2,num3));
    }
    public static double aritmetikOrtalamaBul(double a,double b,double c){
        double sonuc = (a+b+c)/3;
        return sonuc;
    }
}