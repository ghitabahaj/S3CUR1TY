package com.Youcode.security.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Builder
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private Long idTmdb;
    @Column(nullable = false)
    private String name;
    @Temporal(TemporalType.TIME)
    private Date duration;
    private String picture;
    private String linkTrailer;
    private String linkImdb;
    private String director;
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    private String description;
    private String shortLink;
    private String lang;
    private boolean statusSerie;
    private Integer levelView;
    private boolean isMovie;
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    @OneToMany(mappedBy = "media")
    private List<Season> seasons;
    @OneToMany(mappedBy = "media")
    private List<Watchlist> watchlists;
    @OneToMany(mappedBy = "media")
    private List<ServerPlay> serverPlays;
    @ManyToOne
    private TypeQuality typeQuality;
    @OneToOne
    private Slider slider;



}
