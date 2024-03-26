package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class classf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String location;
    private int capacity;
    @ManyToMany(mappedBy = "classf")
    private List<course> courses;

    public classf(String city, String location, int capacity) {
        if (!Objects.equals(city, "")){
            this.city = city;
        } else {
            throw new InputMismatchException("can not put empty city");
        }
        if (!Objects.equals(location, "")){
            this.city = location;
        } else {
            throw new InputMismatchException("can not put empty location");
        }
        if (capacity >= 1) {
            this.capacity = capacity;
        } else {
            throw new InputMismatchException("can not put capacity lower that 1");
        }
    }
}
