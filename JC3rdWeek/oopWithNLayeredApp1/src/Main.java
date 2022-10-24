import oopWithNLayeredApp1.business.ProductManager;
import oopWithNLayeredApp1.core.logging.DataBaseLogger;
import oopWithNLayeredApp1.core.logging.FileLogger;
import oopWithNLayeredApp1.core.logging.MailLogger;
import oopWithNLayeredApp1.dataAccess.JDBCProductDao;
import oopWithNLayeredApp1.dataAccess.HibernateProductDao;
import oopWithNLayeredApp1.entities.Product;

import oopWithNLayeredApp1.core.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Samsung A50",5000);
        Logger[] loggers = {new MailLogger()};
        ProductManager productManager = new ProductManager(new JDBCProductDao(), loggers);
        productManager.add(product1);

    }
}