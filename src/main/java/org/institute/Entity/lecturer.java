package org.institute.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class lecturer {
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
    private String major;
    private String experience;
    private String topics;
    private boolean gender;
    private String Address;
    private boolean active;
    @OneToMany(mappedBy = "lecturer")
    private List<privateLesson> privateLessons;
    @OneToMany(mappedBy = "lecturer")
    private List<lesson> lessons;
    @ManyToMany(mappedBy = "lecturer")
    private List<courseDetails> courseDetailsList;

    public lecturer() {
    }
}
