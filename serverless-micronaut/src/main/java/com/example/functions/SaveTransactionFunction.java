package com.example.functions;

import com.example.Service.TransactionService;
import com.example.models.FunctionResponse;
import com.example.models.TransactionRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.function.Function;

@Singleton
public class SaveTransactionFunction implements Function<TransactionRecord, FunctionResponse> {

    private Logger logger = LoggerFactory.getLogger(SaveTransactionFunction.class.getName());

    @Inject
    TransactionService transactionService;

    @Override
    public FunctionResponse apply(TransactionRecord transactionRecord) {
        logger.debug("Saving transaction {}", transactionRecord);
        TransactionRecord record = transactionService.saveTransaction(transactionRecord);
        return FunctionResponse.builder().status("Successful").message("Successfully processed transaction " + record.getId())
                .build();
    }
}
