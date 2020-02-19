package com.example;

import com.example.functions.SaveTransactionFunction;
import com.example.models.FunctionResponse;
import com.example.models.TransactionRecord;
import io.micronaut.function.aws.MicronautRequestHandler;

import javax.inject.Inject;

public class TeansactionRequestHandler extends MicronautRequestHandler<TransactionRecord, FunctionResponse> {
    @Inject
    SaveTransactionFunction fn;

    @Override
    public FunctionResponse execute(TransactionRecord input) {
        return fn.apply(input);
    }
}
