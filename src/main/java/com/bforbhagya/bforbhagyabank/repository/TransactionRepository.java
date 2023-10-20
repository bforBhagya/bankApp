package com.bforbhagya.bforbhagyabank.repository;

import com.bforbhagya.bforbhagyabank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
