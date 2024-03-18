package org.shiv.digitallibrary.repository;

import org.shiv.digitallibrary.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
