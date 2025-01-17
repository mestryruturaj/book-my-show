package io.rescrypt.book.my.show.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    private long addressId;
    private City city;
    private String line1;
    private String line2;
    private int pinCode;
}
