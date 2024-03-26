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

    private void saveCourse(course course) {
        courseRepository.save(course);
    }
    public boolean addCourse(course course) {
        try {
            saveCourse(course);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    private boolean addCourseDetailsH(Long courseID, courseDetails courseDetails){
        course course = courseRepository.findById(courseID).orElse(null);
        if (course != null) {
            course.addCourseDetails(courseDetails);
            courseRepository.save(course);
            return true;
        }
        return false;
    }
    public boolean addCourseDetails(Long courseID, courseDetails courseDetails) {
        try {
            return addCourseDetailsH(courseID, courseDetails);
        } catch (Exception e) {
            return false;
        }
    }
    private boolean addClassH(Long courseID, classf classf){
        course course = courseRepository.findById(courseID).orElse(null);
        if (course != null) {
            course.addClass(classf);
            courseRepository.save(course);
            return true;
        }
        return false;
    }
    public boolean addClass(Long courseID, classf classf) {
        try {
            return addClassH(courseID, classf);
        } catch (Exception e) {
            return false;
        }
    }
    private boolean addSubjectH(Long courseID, subjectName subjectName){
        course course = courseRepository.findById(courseID).orElse(null);
        if (course != null) {
            course.addSubject(subjectName);
            courseRepository.save(course);
            return true;
        }
        return false;
    }
    public boolean addSubject(Long courseID, subjectName subjectName) {
        try {
            return addSubjectH(courseID, subjectName);
        } catch (Exception e) {
            return false;
        }
    }
}
