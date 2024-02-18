package com.Youcode.security.repository;


import com.Youcode.security.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActorRepository extends JpaRepository<Token, Long> {
}
