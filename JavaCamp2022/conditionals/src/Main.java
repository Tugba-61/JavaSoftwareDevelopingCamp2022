public class Main {

    public static void main(String[] args) {

        int a = 200, b = 80, c = 60;
        int buyukSayi = a;

        if (b > buyukSayi) {

            buyukSayi = b;
        }
        if (c > buyukSayi) {

            buyukSayi = c;
        }

        System.out.println("en büyük sayı : " + buyukSayi);
    }


}
