package io.rescrypt.book.my.show.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Theater {
    @Id
    private long theaterId;
    private Address address;

}
