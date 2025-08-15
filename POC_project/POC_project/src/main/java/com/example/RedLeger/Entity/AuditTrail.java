package com.example.RedLeger.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "audit_trail")
public class AuditTrail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUDIT_ID")
    private Long auditid;

    @Column(name = "TRANSACTION_ID", length = 50, nullable = false)
    private String transactionId;

    @Column(name = "ACTION_TYPE", length = 50, nullable = false)
    private String actiontype;

    @Column(name = "OLD_VALUE", length = 50, nullable = false)
    private String oldvalue;

    @Column(name = "NEW_VALUE", length = 50, nullable = false)
    private String newvalue;

    @Column(name = "CHANGED_BY")
    private Long ChangedBy;

    @Column(name = "CHANGED_AT")
    private Timestamp changedAt;

    // getters and setters


    public Long getAuditid() {
        return auditid;
    }

    public void setAuditid(Long auditid) {
        this.auditid = auditid;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getActiontype() {
        return actiontype;
    }

    public void setActiontype(String actiontype) {
        this.actiontype = actiontype;
    }

    public String getOldvalue() {
        return oldvalue;
    }

    public void setOldvalue(String oldvalue) {
        this.oldvalue = oldvalue;
    }

    public String getNewvalue() {
        return newvalue;
    }

    public void setNewvalue(String newvalue) {
        this.newvalue = newvalue;
    }

    public Long getChangedBy() {
        return ChangedBy;
    }

    public void setChangedBy(Long changedBy) {
        ChangedBy = changedBy;
    }

    public Timestamp getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(Timestamp changedAt) {
        this.changedAt = changedAt;
    }
}