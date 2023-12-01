package ru.goalgomoex.goalgomoex.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.goalgomoex.goalgomoex.entitys.data.UserAuthData;

public interface UserAuthRepository extends JpaRepository<UserAuthData, Long> {
    UserAuthData findByUsername(String username);
   Boolean existsByUsername(String username);
}
