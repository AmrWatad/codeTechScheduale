package org.institute.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.institute.Entity.*;

import java.util.List;

@Repository
public interface studentRepository extends JpaRepository<student, Long> {
    @Query("SELECT s, :currentYear - CAST(SPLIT(s.birthDay, '/')[-1] AS int) AS age FROM student s WHERE age >= :age AND age <= :end")
    List<student> findByAgeRange(@Param("age") int age, @Param("end") int end, @Param("currentYear") int currentYear);
}
