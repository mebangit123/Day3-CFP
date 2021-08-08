package com.greet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greet.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long>{

}
