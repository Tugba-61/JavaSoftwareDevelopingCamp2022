package homework.dataAccess;

import homework.entities.Category;
import homework.entities.Course;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kurs JDBC ile veritabanına eklendi");
    }
}
