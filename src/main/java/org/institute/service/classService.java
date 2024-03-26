package org.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.institute.repositories.*;
import org.institute.Entity.*;

import java.util.Objects;

@Service
public class classService {
    private final classRepository classRepository;

    @Autowired
    public classService(classRepository classRepository) {
        this.classRepository = classRepository;
    }

    private void saveClass(classf classf) {
        classRepository.save(classf);
    }

    public boolean addClass(classf classf) {
        try {
            saveClass(classf);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
