package com.skowyra.libria.dao;

import org.springframework.stereotype.Repository;

import com.skowyra.libria.api.dao.AbstractGenericDao;
import com.skowyra.libria.model.books.Category;

/**
 * @author Maciej Skowyra
 * @date Feb 10, 2015 11:20:23 PM
 */

@Repository("categoryDao")
public class CategoryDaoImpl extends AbstractGenericDao<Category> implements CategoryDao{

}
