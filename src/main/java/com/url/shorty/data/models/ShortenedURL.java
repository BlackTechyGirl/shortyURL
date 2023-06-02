package com.url.shorty.data.models;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ShortenedURL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String originalURL;
    private String shortURL;
    private LocalDate creationDate;
    private LocalDate expirationDate;
    private int clicksCount;
}
