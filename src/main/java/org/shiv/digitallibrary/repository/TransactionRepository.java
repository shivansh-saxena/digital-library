package org.shiv.digitallibrary.repository;

import org.shiv.digitallibrary.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction,Integer> {
}
