package com.libcode.crudjava17.crud17.Users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libcode.crudjava17.crud17.Users.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
