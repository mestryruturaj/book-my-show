package io.rescrypt.book.my.show.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Actor {
    @Id
    private long actorId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
}
