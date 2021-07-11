package com.cremazer.jpa.bookmanager.repository;

import com.cremazer.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author cremazer
 * @since 2021-07-08
 */
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    /**
     * data.sql 실행 시 에러 발생에 대한 문제 해결 참고
     * https://seungyooon.tistory.com/218
     */
    @Test
    @Transactional
    void crud() {
        // create
//        userRepository.save(new User());

        // select all
        // 데이터가 많을 경우 잘 사용하지 않음. 메모리 문제 발생할 수 있음.
//        System.out.println(">>> " + userRepository.findAll());
//        userRepository.findAll().forEach(System.out::println);

        // 이름 역순 출력하기
//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        users.forEach(System.out::println);

        // 1,2,3만 조회하기
//        List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 2L, 3L));
//        users.forEach(System.out::println);

        // 저장하기
//        User user1 = new User("jack", "jack@gmail.com");
//        User user2 = new User("jack2", "jack2@gmail.com");
//
//        userRepository.saveAll(Lists.newArrayList(user1, user2));
//
//        List<User> users = userRepository.findAll();
//        users.forEach(System.out::println);

        // could not initialize proxy [com.cremazer.jpa.bookmanager.domain.User#1] - no Session
//        User user = userRepository.getOne(1L);
//        Optional<User> user = userRepository.findById(1L);
        User user = userRepository.findById(1L).orElse(null);

        System.out.println(user);



    }
}