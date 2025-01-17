package io.rescrypt.book.my.show.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Movie {
    @Id
    private long movieId;
    private String movieName;
    private int durationInMinutes;
    private List<Actor> cast;
}
