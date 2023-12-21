package com.company.pjlcargoconnect.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "MASTERDATA_CARGO_PORTS", indexes = {
        @Index(name = "IDX_MASTERDATA_CARGO_PORT", columnList = "COUNTRY_CODE_ISO2")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_MASTERDATA_CARGO_PORT_UNQ_PORTCODE", columnNames = {"PORT_CODE", "PORT_TYPE"}),
        @UniqueConstraint(name = "IDX_MASTERDATA_CARGO_PORT_UNQ_IATACODE", columnNames = {"IATA_CODE"})
})
@Entity
public class MasterdataCargoPort {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Integer id;

    @NotNull
    @Column(name = "PORT_NAME", nullable = false)
    private String portName;

    @NotNull
    @InstanceName
    @Column(name = "PORT_CODE", nullable = false, length = 10)
    private String portCode;

    @NotNull
    @Column(name = "PORT_TYPE", nullable = false)
    private Integer portType;

    @Column(name = "IATA_CODE", length = 10)
    private String iataCode;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "COUNTRY_CODE_ISO2", referencedColumnName = "COUNTRY_CODE_ISO2")
    @ManyToOne(fetch = FetchType.LAZY)
    private MasterdataCountry country;

    @Column(name = "CITY")
    private String city;

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

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PortTypeEnum getPortType() {
        return portType == null ? null : PortTypeEnum.fromId(portType);
    }

    public void setPortType(PortTypeEnum portType) {
        this.portType = portType == null ? null : portType.getId();
    }

    public String getPortCode() {
        return portCode;
    }

    public void setPortCode(String portCode) {
        this.portCode = portCode;
    }

    public MasterdataCountry getCountry() {
        return country;
    }

    public void setCountry(MasterdataCountry country) {
        this.country = country;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}