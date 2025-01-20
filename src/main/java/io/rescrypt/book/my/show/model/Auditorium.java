package io.rescrypt.book.my.show.model;

import io.rescrypt.book.my.show.model.enums.AuditoriumFeature;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Auditorium {
    @Id
    private int auditoriumId;
    private String name;
    private List<AuditoriumFeature> auditoriumFeatures;
    private Theater theater;
    private List<Seat> seats;
}
