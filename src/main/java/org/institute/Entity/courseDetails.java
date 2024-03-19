package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class courseDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startDate;
    private String EndDate;
    private String scheduleDetails;
    private String studentsNum;
    @OneToMany(mappedBy = "courseDetails")
    private List<enrollment> enrollments;
    @OneToMany(mappedBy = "courseDetails")
    private List<lesson> lessons;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "courseDetailsLecturer", joinColumns = @JoinColumn(name = "courseDetailsID"), inverseJoinColumns = @JoinColumn(name = "lecturerID"))
    private List<lecturer> lecturers;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseID")
    private course course;

    public courseDetails() {
        lecturers = new ArrayList<>();
        lessons = new ArrayList<>();
        enrollments = new ArrayList<>();
    }
}
