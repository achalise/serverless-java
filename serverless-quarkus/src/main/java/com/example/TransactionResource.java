package com.example;

import com.example.models.FunctionResponse;
import com.example.models.TransactionRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.function.Function;

@Path("/transactions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TransactionResource {

    private final Logger log = LoggerFactory.getLogger(TransactionResource.class.getName());

    @Inject
    Function<TransactionRecord, FunctionResponse> fn;


    @POST
    public FunctionResponse saveTransaction(TransactionRecord tx) {
        log.debug("Processing save transaction request for transaction record {}", tx);
        return fn.apply(tx);
    }
}