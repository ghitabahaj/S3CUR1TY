package com.Youcode.security.repository;

import com.Youcode.security.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
