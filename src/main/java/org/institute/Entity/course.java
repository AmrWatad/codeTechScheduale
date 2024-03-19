package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String materials;
    private double cost;
    private boolean isMonthlyPay;
    @OneToMany(mappedBy = "course")
    private List<courseDetails> courseDetailsList;
    @OneToMany(mappedBy = "course")
    private List<subjectName> subjectNames;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "courseClass", joinColumns = @JoinColumn(name = "courseID"), inverseJoinColumns = @JoinColumn(name = "classID"))
    private List<classf> classes;

    public course() {
        classes = new ArrayList<>();
        subjectNames = new ArrayList<>();
        courseDetailsList = new ArrayList<>();
    }
}
