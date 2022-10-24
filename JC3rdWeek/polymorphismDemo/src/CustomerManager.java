import java.sql.SQLSyntaxErrorException;

public class CustomerManager {

public void Add(){
    System.out.println("müşteri eklendi");
    DatabaseLogger logger = new DatabaseLogger();
    logger.Log("log message");
}

}
