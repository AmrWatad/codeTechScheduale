package org.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.institute.repositories.*;
import org.institute.Entity.*;

@Service
public class enrollmentService {
    private final enrollmentRepository enrollmentRepository;

    @Autowired
    public enrollmentService(enrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    private void addEnrollment(enrollment enrollment) {
        enrollmentRepository.save(enrollment);
    }
}
