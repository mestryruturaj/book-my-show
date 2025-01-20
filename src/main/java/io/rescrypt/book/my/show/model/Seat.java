package io.rescrypt.book.my.show.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Seat {
    @Id
    private long seatId;
    private String seatCode;
    private Auditorium auditorium;
}
