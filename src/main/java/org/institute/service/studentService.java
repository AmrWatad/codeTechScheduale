package org.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.institute.repositories.*;
import org.institute.Entity.*;

@Service
public class studentService {
    private final studentRepository studentRepository;

    @Autowired
    public studentService(studentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    private void addStudent(student student) {
        studentRepository.save(student);
    }
}
