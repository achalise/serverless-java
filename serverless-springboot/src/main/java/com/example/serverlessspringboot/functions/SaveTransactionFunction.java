package com.example.serverlessspringboot.functions;

import com.example.serverlessspringboot.models.FunctionResponse;
import com.example.serverlessspringboot.models.TransactionRecord;

import java.util.function.Function;

public class SaveTransactionFunction implements Function<TransactionRecord, FunctionResponse> {

    @Override
    public FunctionResponse apply(TransactionRecord transactionRecord) {
        System.out.println("The transaction record " + transactionRecord);
        return FunctionResponse.builder().message("Successful").status("SUCCESS").build();
    }
}
