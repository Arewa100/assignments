package com.authenticator.services.interfaces;

public interface UserService {
    //this is a quick learning process on json web token
    String registerUser(String username, String password);
    String loginUser(String username, String password);
    String logoutUser(String username, String password);
}
