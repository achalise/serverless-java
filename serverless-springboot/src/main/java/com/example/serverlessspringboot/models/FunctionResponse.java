package com.example.serverlessspringboot.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FunctionResponse {
    private String status;
    private String message;
}
