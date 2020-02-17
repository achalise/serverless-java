package com.example.serverlessspringboot;

import com.example.serverlessspringboot.functions.SaveTransactionFunction;
import com.example.serverlessspringboot.models.FunctionResponse;
import com.example.serverlessspringboot.models.TransactionRecord;
import com.example.serverlessspringboot.service.DefaultTransactionService;
import com.example.serverlessspringboot.service.TransactionService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.FunctionType;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Function;

@SpringBootApplication
public class ServerlessSpringbootApplication implements ApplicationContextInitializer<GenericApplicationContext> {

    @Bean
    public TransactionService transactionService() {
        return new DefaultTransactionService();
    }

    @Bean
    public Function<TransactionRecord, FunctionResponse> saveTransaction() {
        return new SaveTransactionFunction(transactionService());
    }

	public static void main(String[] args) {
        FunctionalSpringApplication.run(ServerlessSpringbootApplication.class, args);
	}

    @Override
    public void initialize(GenericApplicationContext context) {
        context.registerBean("saveTransaction", FunctionRegistration.class,
				() -> new FunctionRegistration<>(saveTransaction())
						.type(FunctionType.from(TransactionRecord.class).to(FunctionResponse.class).getType()));
    }
}
