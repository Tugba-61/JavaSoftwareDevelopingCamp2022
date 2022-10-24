public class Main {
    public static void main(String[] args) {


BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(), new EmailLogger()};

    for(BaseLogger logger:loggers){
        logger.Log("Log mesajı");
    }
    }
}