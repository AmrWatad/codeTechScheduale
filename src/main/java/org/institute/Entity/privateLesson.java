package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class privateLesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String lessonDuration;
    private int cost;
    @ManyToMany(mappedBy = "privateLesson")
    private List<student> students;
    @ManyToOne
    @JoinColumn(name = "lecturerID")
    private lecturer lecturer;

    public privateLesson() {
    }
}
