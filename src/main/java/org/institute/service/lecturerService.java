package org.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.institute.repositories.*;
import org.institute.Entity.*;

@Service
public class lecturerService {
    private final lecturerRepository lecturerRepository;

    @Autowired
    public lecturerService(lecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    private void addLecturer(lecturer lecturer) {
        lecturerRepository.save(lecturer);
    }
}
