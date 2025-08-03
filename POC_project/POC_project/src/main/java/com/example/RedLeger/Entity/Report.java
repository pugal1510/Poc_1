package com.example.RedLeger.Entity;

import jakarta.persistence.*;

import java.security.Timestamp;

@Entity
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "generated_at", nullable = false)
    private Timestamp generatedAt;

    @Column(name = "generated_by", length = 50, nullable = false)
    private String generatedBy;

    @Column(name = "report_type", length = 30, nullable = false)
    private String reportType;

    @Column(name = "file_path", length = 255, nullable = false)
    private String filePath;
    // getters and setters
}