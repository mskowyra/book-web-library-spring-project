package com.skowyra.libria.dao;


import org.springframework.stereotype.Repository;

import com.skowyra.libria.api.dao.AbstractGenericDao;
import com.skowyra.libria.model.books.Books;

/**
 * @author Maciej Skowyra
 * @since 3 lut 2015 17:48:24
 */
@Repository("bookDao")
public class BookDaoImpl extends AbstractGenericDao<Books> implements BookDao {

	

	

}
