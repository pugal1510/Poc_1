
package com.example.RedLeger.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private Long transactionid;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private Long accountnumber;

    @Column(name = "TRANSACTION_TYPE", length = 30, nullable = false)
    private String transactionType;

    @Column(name = "CUSTOMER_ID", length = 30, nullable = false)
    private String customerId;

    @Column(name = "AMOUNT", nullable = false, precision = 18, scale = 2)
    private BigDecimal amount;

    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
    private String description;

    @Column(name = "CREATED_BY", length = 50, nullable = false)
    private String createdBy;

    @Column(name = "CREATED_AT", nullable = false)
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT")
    private Timestamp updatedAt;


    public Long getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Long transactionid) {
        this.transactionid = transactionid;
    }

    public Long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(Long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}