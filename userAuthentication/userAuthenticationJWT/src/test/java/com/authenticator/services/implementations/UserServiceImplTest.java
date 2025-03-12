package com.authenticator.services.implementations;


import com.authenticator.data.repositories.UserRepository;
import com.authenticator.exceptions.UserExceptions;
import com.authenticator.services.interfaces.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @AfterEach
    public void tearDown() {
        userRepository.deleteAll();
    }

    @Test
    @DisplayName("testing if any entity has been registered in the db")
    public void testThatUserDoesNotExist() {
        assertEquals(userRepository.count(), 0L);
    }

    @Test
    public void testToAdd_A_User_Assert_Count_is_One() {
        assertEquals(userService.registerUser("Miracle", "password"), "user registered successfully");
        assertEquals(userRepository.count(), 1L);
    }

    @Test
    public void testThatYou_CannotRegisterSameUser() {
        assertEquals(userService.registerUser("Miracle", "password"), "user registered successfully");
        assertEquals(userRepository.count(), 1L);

        assertThrows(UserExceptions.class, ()-> userService.registerUser("Miracle", "password"));
        assertEquals(userRepository.count(), 1L);
    }

    @Test
    @DisplayName("test that user can login")
    public void testThatThe_User_Can_Login() {
        assertEquals(userService.registerUser("Miracle", "password"), "user registered successfully");
        assertEquals(userRepository.count(), 1L);
        assertEquals(userService.loginUser("Miracle", "password"), "user logged in successfully");
        assertEquals(userRepository.count(), 1L);
    }
    @Test
    @DisplayName("test that user can logout")
    public void testThat_The_User_CanLogout() {
        assertEquals(userService.registerUser("Miracle", "password"), "user registered successfully");
        assertEquals(userRepository.count(), 1L);
        assertEquals(userService.loginUser("Miracle", "password"), "user logged in successfully");
        assertEquals(userRepository.count(), 1L);
        assertEquals(userService.logoutUser("Miracle", "password"), "user logged out successfully");
    }


}