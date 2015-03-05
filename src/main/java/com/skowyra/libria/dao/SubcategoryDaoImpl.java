package com.skowyra.libria.dao;

import org.springframework.stereotype.Repository;

import com.skowyra.libria.api.dao.AbstractGenericDao;
import com.skowyra.libria.model.books.Subcategory;


/**
 * @author Maciej Skowyra
 * 3 lut 2015
 */
@Repository("subcategoryDao")
public class SubcategoryDaoImpl extends AbstractGenericDao<Subcategory> implements SubcategoryDao{

}
