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

@JmixEntity
@Table(name = "TRANSPORT_CONNECTINGS", indexes = {
        @Index(name = "IDX_TRANSPORT_CONNECTINGS_TRANSPORT", columnList = "TRANSPORT_ID"),
        @Index(name = "IDX_TRANSPORT_CONNECTINGS_FLEET", columnList = "FLEET_ID"),
        @Index(name = "IDX_TRANSPORT_CONNECTINGS_PORT_OF_DEPARTURE", columnList = "PORT_OF_DEPARTURE_ID"),
        @Index(name = "IDX_TRANSPORT_CONNECTINGS_PORT_OF_DISCHARGE", columnList = "PORT_OF_DISCHARGE_ID")
})
@Entity
public class TransportConnecting {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "TRANSPORT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Transport transport;

    @JoinColumn(name = "FLEET_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Fleet fleet;

    @Column(name = "VOY_NUMBER")
    private String voyNumber;

    @JoinColumn(name = "PORT_OF_DEPARTURE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataCargoPort portOfDeparture;

    @JoinColumn(name = "PORT_OF_DISCHARGE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataCargoPort portOfDischarge;

    @Column(name = "CONNECTION_SEQUENCE", nullable = false)
    @NotNull
    private Integer connectionSequence;

    @Column(name = "ETD", nullable = false)
    @NotNull
    private OffsetDateTime etd;

    @Column(name = "ETA", nullable = false)
    @NotNull
    private OffsetDateTime eta;

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

    public OffsetDateTime getEta() {
        return eta;
    }

    public void setEta(OffsetDateTime eta) {
        this.eta = eta;
    }

    public OffsetDateTime getEtd() {
        return etd;
    }

    public void setEtd(OffsetDateTime etd) {
        this.etd = etd;
    }

    public Integer getConnectionSequence() {
        return connectionSequence;
    }

    public void setConnectionSequence(Integer connectionSequence) {
        this.connectionSequence = connectionSequence;
    }

    public MasterdataCargoPort getPortOfDischarge() {
        return portOfDischarge;
    }

    public void setPortOfDischarge(MasterdataCargoPort portOfDischarge) {
        this.portOfDischarge = portOfDischarge;
    }

    public MasterdataCargoPort getPortOfDeparture() {
        return portOfDeparture;
    }

    public void setPortOfDeparture(MasterdataCargoPort portOfDeparture) {
        this.portOfDeparture = portOfDeparture;
    }

    public String getVoyNumber() {
        return voyNumber;
    }

    public void setVoyNumber(String voyNumber) {
        this.voyNumber = voyNumber;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
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