package org.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.institute.repositories.*;
import org.institute.Entity.*;

@Service
public class subjectService {
    private final subjectRepository subjectRepository;

    @Autowired
    public subjectService(subjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    private void addSubject(subjectName subjectName) {
        subjectRepository.save(subjectName);
    }
}
