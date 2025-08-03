package com.example.RedLeger.Entity;

import jakarta.persistence.*;

import java.security.Timestamp;

@Entity
@Table(name = "audit_trail")
public class AuditTrail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(length = 50, nullable = false)
    private String action;

    @Column(name = "entity_name", length = 50, nullable = false)
    private String entityName;

    @Column(name = "entity_id", nullable = false)
    private Long entityId;

    @Column(nullable = false)
    private Timestamp timestamp;

    @Column(columnDefinition = "TEXT")
    private String details;
    // getters and setters
}