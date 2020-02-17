package com.example.serverlessspringboot.service;

import com.example.serverlessspringboot.models.TransactionRecord;

public interface TransactionService {
    TransactionRecord saveTransaction(TransactionRecord transactionRecord);
}
