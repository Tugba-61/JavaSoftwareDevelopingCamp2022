package homework.logging;

public class MailLogger implements Logger{
    public void log(String data) {
        System.out.println("Maile loglandı: "+ data);
    }
}
