package com.example.serverlessspringboot.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRecord {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
