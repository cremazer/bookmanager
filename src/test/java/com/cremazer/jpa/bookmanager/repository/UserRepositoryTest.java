package com.cremazer.jpa.bookmanager.repository;

import com.cremazer.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author cremazer
 * @since 2021-07-08
 */
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        // create
        userRepository.save(new User());

        // select all
        // 데이터가 많을 경우 잘 사용하지 않음. 메모리 문제 발생할 수 있음.
        System.out.println(">>> " + userRepository.findAll());
    }
}