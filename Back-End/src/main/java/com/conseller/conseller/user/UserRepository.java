package com.conseller.conseller.user;

import com.conseller.conseller.entity.User;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(String Id);

    Optional<User> findByUserName(String name);

    Optional<User> findByUserIdx(Long userIdx);

    Optional<User> findByUserEmailAndUserName(String userEmail, String userName);

    Optional<User> findByUserEmailAndUserId(String userEmail, String userId);

    @Query("select u.refreshToken from User u where u.userId = :userId")
    Optional<String> findRefreshTokenByUserId(@Param("userId") String userId);

    boolean existsByUserIdx(Long userIdx);

    boolean existsByUserId(String userId);

    boolean existsByUserPassword(String userPassword);

    boolean existsByUserNickname(String userNickname);

    boolean existsByUserEmail(String userEmail);

    boolean existsByUserPhoneNumber(String userPhoneNumber);

    boolean existsByUserIdxAndUserPassword(long userIdx, String userPassword);
}
