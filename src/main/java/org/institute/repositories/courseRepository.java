package org.institute.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.institute.Entity.customEntity.*;
import org.institute.Entity.*;

import java.util.List;

@Repository
public interface courseRepository extends JpaRepository<course , Long> {

    //هون لازم اغيرها للكورس ديتيلز بس فلست اليوم
    @Query("SELECT new org.institute.Entity.customEntity.courseAndStudentNumber(c.id, c.name, c.materials, c.cost, c.isMonthlyPay, COUNT(s)) FROM course c JOIN c.enrollment s GROUP BY c.id, c.name ORDER BY COUNT(s) DESC")
    List<courseAndStudentNumber> orderCourseByNumberOfStudentsWithLimit(int limit);
}
