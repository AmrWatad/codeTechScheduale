package org.institute.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.institute.Entity.*;

@Repository
public interface lecturerRepository extends JpaRepository<lecturer , Long> {
}
