package io.rescrypt.book.my.show.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Theater {
    @Id
    private long theaterId;
    private String name;
    private Address address;
    private List<Auditorium> auditoriums;

}
