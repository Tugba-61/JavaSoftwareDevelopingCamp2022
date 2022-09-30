import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz:");
        int number = scan.nextInt();
        boolean isPrime = true;
        if (number < 1) {
            System.out.println("geçersiz sayı girdiniz");
            return;
        }
        if (number == 1) {
            System.out.println("sayı asal değildir.");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("sayı asaldır");
        } else if (isPrime == false) {
            System.out.println("sayı asal değildir");
        }
    }
}