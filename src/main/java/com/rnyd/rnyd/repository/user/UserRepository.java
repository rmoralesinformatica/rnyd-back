package com.rnyd.rnyd.repository.user;

import com.rnyd.rnyd.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT u FROM UserEntity u LEFT JOIN FETCH u.diets WHERE u.email = :email")
    Optional<UserEntity> findByEmail(@Param("email") String email);

}
