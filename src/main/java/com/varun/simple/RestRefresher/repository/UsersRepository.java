package com.varun.simple.RestRefresher.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varun.simple.RestRefresher.model.Users; 

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}