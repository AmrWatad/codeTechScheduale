package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.security.PrivateKey;
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
    @ManyToMany
    @JoinTable(name = "studentPrivateLesson", joinColumns = @JoinColumn(name = "studentID"), inverseJoinColumns = @JoinColumn(name = "privateLessonID"))
    private List<privateLesson> privateLessons;
    @ManyToMany
    @JoinTable(name = "studentLesson", joinColumns = @JoinColumn(name = "studentID"), inverseJoinColumns = @JoinColumn(name = "lessonID"))
    private List<lesson> lessons;

    public student() {
    }
}
