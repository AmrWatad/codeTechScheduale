package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;

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

    public course(String name, String materials, double cost, boolean isMonthlyPay) {
        if (!Objects.equals(name, "")) {
            this.name = name;
        } else {
            throw new InputMismatchException("can not put empty name");
        }
        if (!Objects.equals(materials, "")) {
            this.materials = materials;
        } else {
            throw new InputMismatchException("can not put empty materials");
        }
        if (cost >= 0) {
            this.cost = cost;
        } else {
            throw new InputMismatchException("can not put capacity lower that 0");
        }
        this.isMonthlyPay = isMonthlyPay;
        classes = new ArrayList<>();
        subjectNames = new ArrayList<>();
        courseDetailsList = new ArrayList<>();
    }

    public void addCourseDetails(courseDetails courseDetails) {
        this.courseDetailsList.add(courseDetails);
    }
    public void addClass(classf classf) {
        this.classes.add(classf);
    }
    public void addSubject(subjectName subjectName) {
        this.subjectNames.add(subjectName);
    }
}
