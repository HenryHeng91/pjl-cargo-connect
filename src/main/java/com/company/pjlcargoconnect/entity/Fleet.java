package com.company.pjlcargoconnect.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "FLEET", indexes = {
        @Index(name = "IDX_FLEET_CARRIER", columnList = "CARRIER_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_FLEET_UNQ", columnNames = {"CARRIER_ID", "FLEET_NUMBER", "FLEET_TYPE"})
})
@Entity
public class Fleet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @JoinColumn(name = "CARRIER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Supplier carrier;

    @Column(name = "FLEET_NUMBER", nullable = false)
    @NotNull
    private String fleet_number;

    @Column(name = "FLEET_TYPE", nullable = false)
    @NotNull
    private Integer fleetType;

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

    public FleetTypeEnum getFleetType() {
        return fleetType == null ? null : FleetTypeEnum.fromId(fleetType);
    }

    public void setFleetType(FleetTypeEnum fleetType) {
        this.fleetType = fleetType == null ? null : fleetType.getId();
    }

    public String getFleet_number() {
        return fleet_number;
    }

    public void setFleet_number(String fleet_number) {
        this.fleet_number = fleet_number;
    }

    public Supplier getCarrier() {
        return carrier;
    }

    public void setCarrier(Supplier carrier) {
        this.carrier = carrier;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}