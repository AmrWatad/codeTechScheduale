package org.example.entites;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date bithDate;

    private Long phoneNumber;
}
