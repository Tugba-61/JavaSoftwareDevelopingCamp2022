package homework.dataAccess;

import homework.entities.Category;
import homework.entities.Course;

public class JDBCCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Kategori JDBC ile veritabanına eklendi");
    }
}
