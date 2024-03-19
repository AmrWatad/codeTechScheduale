package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class subjectName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "courseID")
    private course course;

    public subjectName() {
    }
}
