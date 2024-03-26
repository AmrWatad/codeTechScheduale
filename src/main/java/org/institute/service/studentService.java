package org.institute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.institute.repositories.*;
import org.institute.Entity.*;

import java.time.LocalDate;
import java.util.List;

@Service
public class studentService {
    private final studentRepository studentRepository;
    private final enrollmentService enrollmentService;


    @Autowired
    public studentService(studentRepository studentRepository, enrollmentService enrollmentService) {
        this.studentRepository = studentRepository;
        this.enrollmentService = enrollmentService;
    }

    private void saveStudent(student student) {
        studentRepository.save(student);
    }

    public boolean addStudent(student student) {
        try {
            saveStudent(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean addEnrollmentH(Long studentID, courseDetails courseDetails){
        student student = studentRepository.findById(studentID).orElse(null);
        if (student != null) {
            enrollment enrollment = new enrollment(student, courseDetails);
            enrollmentService.addEnrollment(enrollment);
            student.addEnrollments(enrollment);
            studentRepository.save(student);
            return true;
        }
        return false;
    }
    public boolean addEnrollment(Long studentID, courseDetails courseDetails) {
        if (!courseDetails.isEntryAllowed())
            return false;
        try {
            return addEnrollmentH(studentID, courseDetails);
        } catch (Exception e) {
            return false;
        }
    }

    public List<student> findByAgeRange(int age, int end) {
        LocalDate current = LocalDate.now();
        int currentYear = current.getYear();
        try {
            return studentRepository.findByAgeRange(age, end, currentYear);
        } catch (Exception e) {
            return null;
        }
    }
}
