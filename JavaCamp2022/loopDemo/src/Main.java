public class Main {
    public static void main(String[] args) {
        //For
    for(int i=1 ; i<=10 ; i++){
        for(int j=1 ; j<=10 ; j++){
            System.out.print(i*j +" ");
        }
        System.out.println();
    }
    System.out.println("for döngüsü bitti");
    System.out.println("*****************");
        //While
        int i=1;
        while(i<=10){
            System.out.println(i);
           i++;
        }
        System.out.println("while döngüsü bitti.");
        //Do-While
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<=10);
        System.out.println("do-while döngüsü bitti");
    }
}