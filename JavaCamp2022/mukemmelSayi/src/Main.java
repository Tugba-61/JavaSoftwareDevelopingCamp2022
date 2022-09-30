import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int number = scan.nextInt();
        int total = 0;
        for(int i=1 ; i<number ; i++){
            if(number%i==0){
                total += i;
            }
        }
        if(total==number){
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
        }
        else{
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir");
        }
    }
}