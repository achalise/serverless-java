package com.example;

import com.example.models.FunctionResponse;
import com.example.models.TransactionRecord;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;
import java.util.function.Function;

@Controller("/transactions")
public class TransactionResource {

    @Inject
    private Function<TransactionRecord, FunctionResponse> fn;

    @Post
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public FunctionResponse saveTransaction(TransactionRecord tx) {
        return fn.apply(tx);
    }
}
