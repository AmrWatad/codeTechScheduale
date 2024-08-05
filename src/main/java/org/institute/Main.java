package org.institute;

import org.institute.Entity.student;
import org.institute.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


@SpringBootApplication

public class Main {
    @Autowired
    static studentService st;
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        st.addStudent(new student("mohmad","majadly","m1052007", "10/5/2007",true));
    }
}

