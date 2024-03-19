package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecturerID")
    private lecturer lecturer;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseDetailsID")
    private courseDetails courseDetails;

    public lesson() {
        students = new ArrayList<>();
    }
}

