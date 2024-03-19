package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double lessonLong;
    private String date;
    private String time;
    private boolean isCanceled;
    private String material;
    @ManyToMany(mappedBy = "lesson")
    private List<student> students;
    @ManyToOne
    @JoinColumn(name = "lecturerID")
    private lecturer lecturer;
    @ManyToOne
    @JoinColumn(name = "courseDetailsID")
    private courseDetails courseDetails;

    public lesson() {
    }
}

