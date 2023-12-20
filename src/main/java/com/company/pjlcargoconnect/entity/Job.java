package com.company.pjlcargoconnect.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "JOBS", indexes = {
        @Index(name = "IDX_JOBS_FACTORY", columnList = "COMPANY_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_JOB_UNQ", columnNames = {"JOB_NUMBER"})
})
@Entity
public class Job {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "COMPANY_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Company companyId;

    @Column(name = "JOB_NUMBER", nullable = false)
    @NotNull
    private String jobNumber;

    @Column(name = "CLIENT_BOOKING_NUMBER")
    private String clientBookingNumber;

    @Column(name = "BOOKING_RECEIVED_DATE")
    private OffsetDateTime bookingReceivedDate;

    @Column(name = "BOOKING_SENDER_NAME", length = 100)
    private String bookingSenderName;

    @JmixGeneratedValue
    @Column(name = "UUID")
    private UUID uuid;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private Integer status;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    private OffsetDateTime createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    private OffsetDateTime lastModifiedDate;

    public Job() {
        this.setStatus(1);
    }

    public String getBookingSenderName() {
        return bookingSenderName;
    }

    public void setBookingSenderName(String bookingSenderName) {
        this.bookingSenderName = bookingSenderName;
    }

    public OffsetDateTime getBookingReceivedDate() {
        return bookingReceivedDate;
    }

    public void setBookingReceivedDate(OffsetDateTime bookingReceivedDate) {
        this.bookingReceivedDate = bookingReceivedDate;
    }

    public String getClientBookingNumber() {
        return clientBookingNumber;
    }

    public void setClientBookingNumber(String clientBookingNumber) {
        this.clientBookingNumber = clientBookingNumber;
    }

    public Company getCompanyId() {
        return companyId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Company getFactoryId() {
        return companyId;
    }

    public void setFactoryId(Company companyId) {
        this.companyId = companyId;
    }

    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}