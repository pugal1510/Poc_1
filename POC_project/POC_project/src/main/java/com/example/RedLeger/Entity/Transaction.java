package com.example.RedLeger.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_type", length = 30, nullable = false)
    private String transactionType;

    @Column(name = "customer_id", length = 30, nullable = false)
    private String customerId;

    @Column(nullable = false, precision = 18, scale = 2)
    private BigDecimal amount;

    @Column(length = 20, nullable = false)
    private String status;

    @Column(columnDefinition = "TEXT")
    private String remarks;

    @Column(name = "created_by", length = 50, nullable = false)
    private String createdBy;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

}