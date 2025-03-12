package com.authenticator.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
    private String username;
    private String password;
    private boolean isLoggedIn = false;
    @Id
    private String id;
}
