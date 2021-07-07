package com.cremazer.jpa.bookmanager.repository;

import com.cremazer.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cremazer
 * @since 2021-07-08
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
