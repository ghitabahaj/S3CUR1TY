package com.Youcode.security.entities;


import com.Youcode.security.enums.TypeGenre;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private TypeGenre genre;

}
