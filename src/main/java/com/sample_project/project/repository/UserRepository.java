package com.sample_project.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample_project.project.model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findUserByEmail(String email);
}
