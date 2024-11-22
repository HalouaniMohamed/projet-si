package com.projet.si.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projet.si.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}