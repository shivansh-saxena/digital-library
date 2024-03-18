package org.shiv.digitallibrary.repository;

import org.shiv.digitallibrary.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
