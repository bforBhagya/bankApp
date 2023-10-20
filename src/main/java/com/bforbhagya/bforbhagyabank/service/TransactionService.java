package com.bforbhagya.bforbhagyabank.service;

import com.bforbhagya.bforbhagyabank.dto.TransactionDTO;
import com.bforbhagya.bforbhagyabank.entity.Transaction;
import com.bforbhagya.bforbhagyabank.repository.TransactionRepository;
import com.bforbhagya.bforbhagyabank.serviceInterface.TransactionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService implements TransactionServiceInterface {
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransactionDTO transactionDTO) {

        Transaction transaction = Transaction.builder()
                .transactionType(transactionDTO.getTransactionType())
                .accountNumber(transactionDTO.getAccountNumber())
                .amount(transactionDTO.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);

    }
}
