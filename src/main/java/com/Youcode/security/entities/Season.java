package com.Youcode.security.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int seasonNumber;
    private String picture;
    @ManyToOne
    private Media media;
    @OneToMany(mappedBy = "season")
    private List<Episode> episodes;
}
