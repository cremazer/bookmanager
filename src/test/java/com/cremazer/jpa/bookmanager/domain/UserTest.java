package com.cremazer.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

/**
 * @author cremazer
 * @since 2021-07-12
 */
public class UserTest {
    @Test
    void Test() {
        User user = new User();
        user.setEmail("cremazer@gmail.com");
        user.setName("cremazer");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(null, "cremazer", "cremazer@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("cremazer", "cremazer@gmail.com");

        User user3 = User.builder()
                .name("cremazer")
                .email("cremazer@gmail.com")
                .build();

        System.out.println(">>> " + user.toString());
    }
}
