package com.arsenydeveloper.applang.user.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arsenydeveloper.applang.user.model.U;

@Repository
public interface URepository extends JpaRepository<U, UUID> {

    @Query("SELECT u FROM U u WHERE u.email = ?1")
    Optional<U> findByEmail(String email);

    Optional<U> findById(UUID id);

    void deleteById(UUID id);
}
