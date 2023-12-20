package com.company.pjlcargoconnect.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "SHIPMENTS", indexes = {
        @Index(name = "IDX_SHIPMENT_JOB", columnList = "JOB_ID"),
        @Index(name = "IDX_SHIPMENT_SHIPPER", columnList = "SHIPPER_ID"),
        @Index(name = "IDX_SHIPMENT_CONSIGNEE", columnList = "CONSIGNEE_ID"),
        @Index(name = "IDX_SHIPMENT_ORIGIN_COUNTRY", columnList = "ORIGIN_COUNTRY_ID"),
        @Index(name = "IDX_SHIPMENT_DESTINATION_COUNTRY", columnList = "DESTINATION_COUNTRY_ID")
})
@Entity
public class Shipment {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "JOB_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Job job;

    @JoinColumn(name = "SHIPPER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company shipper;

    @JoinColumn(name = "CONSIGNEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company consignee;

    @JoinColumn(name = "ORIGIN_COUNTRY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MasterdataCountry originCountry;

    @JoinColumn(name = "DESTINATION_COUNTRY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MasterdataCountry destinationCountry;

    @Column(name = "STATUS")
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

    public Shipment() {
        this.setStatus(1);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public MasterdataCountry getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(MasterdataCountry destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public MasterdataCountry getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(MasterdataCountry originCountry) {
        this.originCountry = originCountry;
    }

    public Company getConsignee() {
        return consignee;
    }

    public void setConsignee(Company consignee) {
        this.consignee = consignee;
    }

    public Company getShipper() {
        return shipper;
    }

    public void setShipper(Company shipper) {
        this.shipper = shipper;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}