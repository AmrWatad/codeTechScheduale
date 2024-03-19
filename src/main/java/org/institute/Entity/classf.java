package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class classf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int num;
    private String city;
    private String location;
    private int capacity;
    @ManyToMany(mappedBy = "classf")
    private List<course> courses;

    public classf() {
    }
}
