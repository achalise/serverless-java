package com.example.serverlessspringboot.service;

import com.example.serverlessspringboot.models.TransactionRecord;

public class DefaultTransactionService implements TransactionService {
    @Override
    public TransactionRecord saveTransaction(TransactionRecord transactionRecord) {
        transactionRecord.setId("232323");
        return transactionRecord;
    }
}
