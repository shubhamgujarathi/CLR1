package com.clr1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clr1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
