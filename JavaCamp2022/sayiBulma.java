public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,3,4,5};
        int aranacak = 15;
        boolean varMi = false;
        for(int sayi : sayilar){
            if(sayi == aranacak){
               varMi = true;
               break;
            }
        }
if(varMi){
    System.out.println("sayı mevcuttur");
}
else{
    System.out.println("sayı mevcut değildir");
}

    }
}
