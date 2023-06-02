package com.url.shorty.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Click {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "url_id")
    private ShortenedURL shortenedURL;
    private LocalDate clickDateTime;
    private String ipAddress;

}
