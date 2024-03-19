package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecturerID")
    private lecturer lecturer;

    public privateLesson() {
        students = new ArrayList<>();
    }
}
