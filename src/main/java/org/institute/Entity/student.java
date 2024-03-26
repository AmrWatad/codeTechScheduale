package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;
    private String urlPhoto;
    private int money;
    private String birthDay;
    private boolean gender;
    private String Address;
    private boolean active;
    @OneToMany(mappedBy = "student")
    private List<enrollment> enrollments;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "studentPrivateLesson", joinColumns = @JoinColumn(name = "studentID"), inverseJoinColumns = @JoinColumn(name = "privateLessonID"))
    private List<privateLesson> privateLessons;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "studentLesson", joinColumns = @JoinColumn(name = "studentID"), inverseJoinColumns = @JoinColumn(name = "lessonID"))
    private List<lesson> lessons;

    public student(String firstName, String lastName, String password, String birthDay, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.birthDay = birthDay;
        this.gender = gender;
        this.active = true;
        enrollments = new ArrayList<>();
        privateLessons = new ArrayList<>();
        lessons = new ArrayList<>();
    }

    public void addEnrollments(enrollment enrollment) {
        this.enrollments.add(enrollment);
    }
}
