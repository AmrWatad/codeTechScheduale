package org.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.institute.repositories.*;
import org.institute.Entity.*;

import java.util.List;

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
    private boolean addCourseDetails(Long courseID, courseDetails courseDetails){
        course course = courseRepository.findById(courseID).orElse(null);
        if (course != null) {
            List<courseDetails> courseDetailsList = course.getCourseDetailsList();
            courseDetailsList.add(courseDetails);
            courseRepository.addCourseDetailsToCourse(courseID, courseDetailsList);
            return true;
        }
        return false;
    }
}
