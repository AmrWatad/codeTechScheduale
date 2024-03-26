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

    private void saveSubject(subjectName subjectName) {
        subjectRepository.save(subjectName);
    }
    public boolean addSubject(subjectName subjectName) {
        try {
            saveSubject(subjectName);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
