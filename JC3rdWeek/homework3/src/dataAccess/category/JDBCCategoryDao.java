package dataAccess.category;

import entities.Category;

public class JDBCCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori JDBC ile veritabanına eklendi");
    }
}
