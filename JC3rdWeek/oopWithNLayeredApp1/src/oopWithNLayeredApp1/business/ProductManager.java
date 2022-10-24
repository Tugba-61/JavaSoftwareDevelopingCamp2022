package oopWithNLayeredApp1.business;
import oopWithNLayeredApp1.core.logging.Logger;
import oopWithNLayeredApp1.dataAccess.JDBCProductDao;
import oopWithNLayeredApp1.dataAccess.ProductDao;
import oopWithNLayeredApp1.entities.Product;

public class ProductManager {
private ProductDao productDao;
private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }
    public void add(Product product) throws Exception {
        //iş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("price of product can not be fewer than 10");
        }
        // ProductDao productDao = new JDBCProductDao();
        productDao.add(product);
        for(Logger logger:loggers){
            logger.log(product.getName());
        }
    }
}
