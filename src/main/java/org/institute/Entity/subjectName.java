package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.InputMismatchException;
import java.util.Objects;

@Entity
@Data
public class subjectName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseID")
    private course course;

    public subjectName(String name) {
        if (!Objects.equals(name, "")) {
            this.name = name;
        } else {
            throw new InputMismatchException("can not put empty name");
        }
    }
}
