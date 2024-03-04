package com.Youcode.security.repository;


import com.Youcode.security.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    Optional<Actor> findByFullName(String name);
}
