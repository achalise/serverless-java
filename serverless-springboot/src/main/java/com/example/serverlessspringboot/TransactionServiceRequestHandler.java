package com.example.serverlessspringboot;

import com.example.serverlessspringboot.models.FunctionResponse;
import com.example.serverlessspringboot.models.TransactionRecord;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class TransactionServiceRequestHandler extends SpringBootRequestHandler<TransactionRecord, FunctionResponse> {
}
