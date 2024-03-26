package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startDate;
    private String endDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentID")
    private student student;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseDetailsID")
    private courseDetails courseDetails;

    public enrollment(org.institute.Entity.student student, org.institute.Entity.courseDetails courseDetails) {
        LocalDate current = LocalDate.now();
        int day = current.getDayOfMonth();
        int month = current.getMonthValue();
        int year = current.getYear();
        this.startDate = day + "/" + month + "/" + year;
        this.student = student;
        this.courseDetails = courseDetails;
    }
}
