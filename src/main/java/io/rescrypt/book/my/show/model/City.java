package io.rescrypt.book.my.show.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class City {
    @Id
    private long cityId;
    private String cityName;
    private String state;
    private String country;
}
