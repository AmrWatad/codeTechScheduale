package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startDate;
    private String endDate;
    @ManyToOne
    @JoinColumn(name = "studentID")
    private student student;
    @ManyToOne
    @JoinColumn(name = "courseDetailsID")
    private courseDetails courseDetails;

    public enrollment() {
    }
}
