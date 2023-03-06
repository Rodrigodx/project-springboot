package com.rodrigodx.aprendendo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigodx.aprendendo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
