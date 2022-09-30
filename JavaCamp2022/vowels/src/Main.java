public class Main {
    public static void main(String[] args){
char letter = 'K';

switch(letter){
    case 'A':
    case 'I':
    case 'O':
    case 'U':
    case 'İ':
    case 'E':
    case 'Ü':
    case 'Ö':
        System.out.println("Sesli harf");
        break;
    default:
        System.out.println("Sessiz harf");
}


    }
}