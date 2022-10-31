package homework.business;

import homework.dataAccess.CategoryDao;
import homework.entities.Category;
import homework.logging.Logger;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private Category[] categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;

    }

    public void add(Category category) throws Exception {
        for (Category kategori : categories) {
            if (kategori.getCategoryName() == category.getCategoryName()) {
                throw new Exception("Category name has already been exist");
            }
        }
        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }


    }
}