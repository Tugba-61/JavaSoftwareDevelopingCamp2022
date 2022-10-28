package business;

import dataAccess.category.CategoryDao;
import entities.Category;
import logging.Logger;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private Category[] categories;

    CategoryManager(CategoryDao categoryDao,Logger[] loggers, Category[] categories){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }
    public void add(Category category)throws Exception{
        for(Category kategori : categories){
            if(kategori.getCategoryName() == category.getCategoryName()){
                throw new Exception("Category name can not be the same");
            }

        }
categoryDao.add(category);
        for(Logger logger : loggers){
            logger.log(category.getCategoryName());
        }
    }
}
