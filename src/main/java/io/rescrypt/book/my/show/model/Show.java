package io.rescrypt.book.my.show.model;

import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Show {
    private long showId;
    private String name;
    private LocalDateTime showTime;
    private Movie movie;
    private Auditorium auditorium;
}
