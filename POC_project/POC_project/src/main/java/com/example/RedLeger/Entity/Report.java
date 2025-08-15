
package com.example.RedLeger.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPORT_ID")
    private Long reportid;

    @Column(name = "REPORT_NAME", nullable = false)
    private String reportname;

    @Column(name = "REPORT_TYPE", length = 50, nullable = false)
    private String reporttype;

    // Removed duplicate reportType field

    @Column(name = "FILE_PATH", length = 255, nullable = false)
    private String filePath;

    @Column(name = "GENERATED_BY")
    private Long generatedBy;

    @Column(name = "GENERATED_AT")
    private Timestamp generatedAt;


    public Long getReportid() {
        return reportid;
    }

    public void setReportid(Long reportid) {
        this.reportid = reportid;
    }

    public String getReportname() {
        return reportname;
    }

    public void setReportname(String reportname) {
        this.reportname = reportname;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Long getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Long generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Timestamp getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Timestamp generatedAt) {
        this.generatedAt = generatedAt;
    }
}