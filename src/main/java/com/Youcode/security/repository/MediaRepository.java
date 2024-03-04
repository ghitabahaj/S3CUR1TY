package com.Youcode.security.repository;


import com.Youcode.security.entities.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends JpaRepository<Media,Long> {
}
