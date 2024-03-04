package com.Youcode.security.entities;


import jakarta.persistence.*;

@Entity
public class Watchlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User Users;
    @ManyToOne
    @JoinColumn(name = "media_id")
    private Media media;
}
