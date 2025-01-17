package io.rescrypt.book.my.show.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Auditorium {
    @Id
    private int auditoriumId;
    private String name;
}
