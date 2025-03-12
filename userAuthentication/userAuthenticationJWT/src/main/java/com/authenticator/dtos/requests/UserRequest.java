package com.authenticator.dtos.requests;

import lombok.Data;

@Data
public class UserRequest {
    private String username;
    private String password;
}
