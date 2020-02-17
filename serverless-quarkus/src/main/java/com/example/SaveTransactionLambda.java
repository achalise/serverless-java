package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.example.functions.SaveTransactionFunction;
import com.example.models.FunctionResponse;
import com.example.models.TransactionRecord;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class SaveTransactionLambda implements RequestHandler<TransactionRecord, FunctionResponse> {

    @Inject
    SaveTransactionFunction fn;

    @Override
    public FunctionResponse handleRequest(TransactionRecord record, Context context) {
        return fn.apply(record);
    }
}
