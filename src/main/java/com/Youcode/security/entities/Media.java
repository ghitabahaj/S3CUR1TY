package com.Youcode.security.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private int duration;

    private String picture;

    private String link_media;

    private String link_imdb;

    private String link_trailer;

    private LocalDate releaseDate;

    private String description;

    private String director;



}
