package org.shiv.digitallibrary.repository;

import org.shiv.digitallibrary.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
}
