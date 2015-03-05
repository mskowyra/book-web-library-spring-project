package com.skowyra.libria.dao;

import org.springframework.stereotype.Repository;

import com.skowyra.libria.api.dao.AbstractGenericDao;
import com.skowyra.libria.model.books.Author;

/**
 * @author Maciej Skowyra
 * @since 3 lut 2015 19:15:16
 */
@Repository(value="authorDao")
public class AuthorDaoImpl extends AbstractGenericDao<Author> implements AuthorDao{

}
