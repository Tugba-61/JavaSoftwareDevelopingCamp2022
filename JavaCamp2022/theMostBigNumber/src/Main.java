public class Main {
    public static void main(String[] args) {

int num1 = 26;
int num2 = 25;
int num3 = 2;
int enBuyuk = num1;
if(num2>enBuyuk){
   enBuyuk = num2;
}
else if(num3>enBuyuk){
    enBuyuk = num3;
}

System.out.println("en büyük sayı: "+enBuyuk);
    }
}