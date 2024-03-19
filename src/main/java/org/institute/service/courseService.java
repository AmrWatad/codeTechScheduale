package org.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.institute.repositories.*;
import org.institute.Entity.*;

@Service
public class courseService {
    private final courseRepository courseRepository;

    @Autowired
    public courseService(courseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    private void addCourse(course course) {
        courseRepository.save(course);
    }
}
