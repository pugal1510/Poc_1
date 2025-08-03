package com.example.RedLeger.Repository;

import com.example.RedLeger.Entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

    // Define custom query methods if needed
    // For example:
    // List<Report> findByUserId(Long userId);
}
