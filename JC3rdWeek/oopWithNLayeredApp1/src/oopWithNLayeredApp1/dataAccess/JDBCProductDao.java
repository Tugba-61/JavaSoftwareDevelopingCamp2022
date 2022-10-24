package oopWithNLayeredApp1.dataAccess;

import oopWithNLayeredApp1.entities.Product;

public class JDBCProductDao implements ProductDao{
public void add(Product product){
    //sadece db erişim kodları buraya yazılır.
    System.out.println("JDBC ile veritabanına eklendi");
}

}
