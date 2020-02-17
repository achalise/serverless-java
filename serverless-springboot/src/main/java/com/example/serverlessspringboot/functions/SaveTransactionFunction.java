package com.example.serverlessspringboot.functions;

import com.example.serverlessspringboot.models.FunctionResponse;
import com.example.serverlessspringboot.models.TransactionRecord;
import com.example.serverlessspringboot.service.TransactionService;

import java.util.function.Function;

public class SaveTransactionFunction implements Function<TransactionRecord, FunctionResponse> {

    private final TransactionService transactionService;

    public SaveTransactionFunction(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Override
    public FunctionResponse apply(TransactionRecord transactionRecord) {
        System.out.println("The transaction record " + transactionRecord);
        TransactionRecord record = transactionService.saveTransaction(transactionRecord);
        return FunctionResponse.builder().message("Successfully saved transaction " + record.getId())
                .status("SUCCESS").build();
    }
}
