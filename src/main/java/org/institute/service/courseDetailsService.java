package org.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.institute.repositories.*;
import org.institute.Entity.*;

@Service
public class courseDetailsService {
    private final courseDetailsRepository courseDetailsRepository;

    @Autowired
    public courseDetailsService(courseDetailsRepository courseDetailsRepository) {
        this.courseDetailsRepository = courseDetailsRepository;
    }

    private void saveCourseDetails(courseDetails courseDetails) {
        courseDetailsRepository.save(courseDetails);
    }
    public boolean addCourseDetails(courseDetails courseDetails) {
        try {
            saveCourseDetails(courseDetails);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
