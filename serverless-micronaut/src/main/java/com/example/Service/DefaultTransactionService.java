package com.example.Service;

import com.example.models.TransactionRecord;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;

@Slf4j
@Singleton
public class DefaultTransactionService implements TransactionService {


    @Override
    public TransactionRecord saveTransaction(TransactionRecord tx) {
        log.debug("Saving transaction {}", tx);
        tx.setId("22334455");
        return tx;
    }
}
