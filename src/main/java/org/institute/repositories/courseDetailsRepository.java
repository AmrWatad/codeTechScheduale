package org.institute.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.institute.Entity.*;

import java.util.List;

@Repository
public interface courseDetailsRepository extends JpaRepository<courseDetails , Long> {
    @Modifying
    @Transactional
    @Query("UPDATE course c SET c.courseDetailsList = :courseDetailsList WHERE c.id = :courseID")
    void addCourseDetailsToCourse(@Param("courseID") Long courseID, @Param("courseDetailsList") List<courseDetails> courseDetailsList);
}
