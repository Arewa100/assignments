package com.authenticator.services.implementations;

import com.authenticator.data.models.User;
import com.authenticator.data.repositories.UserRepository;
import com.authenticator.exceptions.UserExceptions;
import com.authenticator.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String registerUser(String username, String password) {
        checkIfUserExists(username, password);
        User createdUser = new User();
        createdUser.setUsername(username);
        createdUser.setPassword(password);
        userRepository.save(createdUser);
        return "user registered successfully";
    }


    private void checkIfUserExists(String username, String password) {
        List<User> users = userRepository.findAll();
        Optional<User> foundUser = users.stream().filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password)).findFirst();
        if (foundUser.isPresent()) throw new UserExceptions("user already exists");
    }

    private void checkIfUserDoesNotExist(String username, String password) {
        List<User> users = userRepository.findAll();
        Optional<User> foundUser = users.stream().filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password)).findFirst();
        if (foundUser.isEmpty()) throw new UserExceptions("user does not exists");

    }

    @Override
    public String loginUser(String username, String password) {
        checkIfUserDoesNotExist(username, password);
        List<User> users = userRepository.findAll();
        Optional<User> foundUser = users.stream().filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password)).findFirst();
        User user = foundUser.get();
        user.setLoggedIn(true);
        userRepository.save(user);
        return "user logged in successfully";
    }

    @Override
    public String logoutUser(String username, String password) {
        checkIfUserDoesNotExist(username, password);
        List<User> users = userRepository.findAll();
        Optional<User> foundUser = users.stream().filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password)).findFirst();
        User user = foundUser.get();
        user.setLoggedIn(false);
        userRepository.save(user);
        return "user logged out successfully";
    }
}
