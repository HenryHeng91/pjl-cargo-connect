package com.company.pjlcargoconnect.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Date;

@JmixEntity
@Table(name = "TRANSPORTS", indexes = {
        @Index(name = "IDX_TRANSPORTS_PJL_PRODUCT", columnList = "PJL_PRODUCT_ID"),
        @Index(name = "IDX_TRANSPORTS_QUOTE", columnList = "QUOTE_ID"),
        @Index(name = "IDX_TRANSPORTS_TRANSPORT_TYPE", columnList = "TRANSPORT_TYPE_ID"),
        @Index(name = "IDX_TRANSPORTS_NOTIFY_PARTY", columnList = "NOTIFY_PARTY_ID"),
        @Index(name = "IDX_TRANSPORTS_CARRIER", columnList = "CARRIER_ID"),
        @Index(name = "IDX_TRANSPORTS_HANDLING_AGENT", columnList = "HANDLING_AGENT_ID"),
        @Index(name = "IDX_TRANSPORTS_PORT_OF_LOADING", columnList = "PORT_OF_LOADING_ID"),
        @Index(name = "IDX_TRANSPORTS_PORT_OF_DISCHARGE", columnList = "PORT_OF_DISCHARGE_ID"),
        @Index(name = "IDX_TRANSPORTS_PORT_OF_DESTINATION", columnList = "PORT_OF_DESTINATION_ID"),
        @Index(name = "IDX_TRANSPORTS_WEIGHT_UNIT", columnList = "WEIGHT_UNIT_ID"),
        @Index(name = "IDX_TRANSPORTS_VOLUME_UNIT", columnList = "VOLUME_UNIT_ID"),
        @Index(name = "IDX_TRANSPORTS_CURRENCY", columnList = "CURRENCY_ID"),
        @Index(name = "IDX_TRANSPORTS_PACKAGE_UNIT", columnList = "PACKAGE_UNIT_ID")
})
@Entity
public class Transport {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @Column(name = "MBL")
    private String mbl;

    @Column(name = "HBL")
    private String hbl;

    @Column(name = "ETD", nullable = false)
    @NotNull
    private OffsetDateTime etd;

    @Column(name = "ETA", nullable = false)
    @NotNull
    private OffsetDateTime eta;

    @Column(name = "ATD")
    private OffsetDateTime atd;

    @Column(name = "ATA")
    private OffsetDateTime ata;

    @JoinColumn(name = "TRANSPORT_TYPE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataModeOfTransport modeOfTransport;

    @JoinColumn(name = "PORT_OF_LOADING_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataCargoPort portOfLoading;

    @JoinColumn(name = "PORT_OF_DISCHARGE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataCargoPort portOfDischarge;

    @JoinColumn(name = "PORT_OF_DESTINATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MasterdataCargoPort portOfDestination;

    @JoinColumn(name = "PJL_PRODUCT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PjlProduct pjlProduct;

    @JoinColumn(name = "QUOTE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PriceQuote quote;

    @JoinColumn(name = "NOTIFY_PARTY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company notifyParty;

    @JoinColumn(name = "CARRIER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Supplier carrier;

    @JoinColumn(name = "HANDLING_AGENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Supplier handlingAgent;

    @Column(name = "FREIGHT_TYPE")
    private Integer freightType;

    @Column(name = "CARRIER_NETWEIGHT")
    private Double carrierNetweight;

    @Column(name = "CARRIER_VOLUMEWEIGHT")
    private Double carrierVolumeweight;

    @Column(name = "CARRIER_CHARGEABLE_WEIGHT")
    private Double carrierChargeableWeight;

    @Column(name = "CARRIER_VOLUME")
    private Double carrierVolume;

    @JoinColumn(name = "WEIGHT_UNIT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataUnit weightUnit;

    @JoinColumn(name = "VOLUME_UNIT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataUnit volumeUnit;

    @Column(name = "HANDLINGINFO_REMARK", length = 500)
    private String handlinginfoRemark;

    @Column(name = "REMARK", length = 500)
    private String remark;

    @Column(name = "TOTAL_FREIGHT_PREPAID", precision = 19, scale = 2)
    private BigDecimal totalFreightPrepaid;

    @Column(name = "TOTAL_FREIGHT_COLLECT", precision = 19, scale = 2)
    private BigDecimal totalFreightCollect;

    @JoinColumn(name = "CURRENCY_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataCurrency currency;

    @Column(name = "MBL_ISSUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date mblIssueDate;

    @JoinColumn(name = "PACKAGE_UNIT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataUnit packageUnit;

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

    public OffsetDateTime getAta() {
        return ata;
    }

    public void setAta(OffsetDateTime ata) {
        this.ata = ata;
    }

    public OffsetDateTime getAtd() {
        return atd;
    }

    public void setAtd(OffsetDateTime atd) {
        this.atd = atd;
    }

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

    public MasterdataUnit getPackageUnit() {
        return packageUnit;
    }

    public void setPackageUnit(MasterdataUnit packageUnit) {
        this.packageUnit = packageUnit;
    }

    public Date getMblIssueDate() {
        return mblIssueDate;
    }

    public void setMblIssueDate(Date mblIssueDate) {
        this.mblIssueDate = mblIssueDate;
    }

    public MasterdataCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(MasterdataCurrency currency) {
        this.currency = currency;
    }

    public BigDecimal getTotalFreightCollect() {
        return totalFreightCollect;
    }

    public void setTotalFreightCollect(BigDecimal totalFreightCollect) {
        this.totalFreightCollect = totalFreightCollect;
    }

    public BigDecimal getTotalFreightPrepaid() {
        return totalFreightPrepaid;
    }

    public void setTotalFreightPrepaid(BigDecimal totalFreightPrepaid) {
        this.totalFreightPrepaid = totalFreightPrepaid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHandlinginfoRemark() {
        return handlinginfoRemark;
    }

    public void setHandlinginfoRemark(String handlinginfoRemark) {
        this.handlinginfoRemark = handlinginfoRemark;
    }

    public MasterdataUnit getVolumeUnit() {
        return volumeUnit;
    }

    public void setVolumeUnit(MasterdataUnit volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    public MasterdataUnit getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(MasterdataUnit weightUnit) {
        this.weightUnit = weightUnit;
    }

    public Double getCarrierVolume() {
        return carrierVolume;
    }

    public void setCarrierVolume(Double carrierVolume) {
        this.carrierVolume = carrierVolume;
    }

    public Double getCarrierChargeableWeight() {
        return carrierChargeableWeight;
    }

    public void setCarrierChargeableWeight(Double carrierChargeableWeight) {
        this.carrierChargeableWeight = carrierChargeableWeight;
    }

    public Double getCarrierVolumeweight() {
        return carrierVolumeweight;
    }

    public void setCarrierVolumeweight(Double carrierVolumeweight) {
        this.carrierVolumeweight = carrierVolumeweight;
    }

    public void setCarrierNetweight(Double carrierNetweight) {
        this.carrierNetweight = carrierNetweight;
    }

    public Double getCarrierNetweight() {
        return carrierNetweight;
    }

    public FreightTypeEnum getFreightType() {
        return freightType == null ? null : FreightTypeEnum.fromId(freightType);
    }

    public void setFreightType(FreightTypeEnum freightType) {
        this.freightType = freightType == null ? null : freightType.getId();
    }

    public MasterdataCargoPort getPortOfDestination() {
        return portOfDestination;
    }

    public void setPortOfDestination(MasterdataCargoPort portOfDestination) {
        this.portOfDestination = portOfDestination;
    }

    public MasterdataCargoPort getPortOfDischarge() {
        return portOfDischarge;
    }

    public void setPortOfDischarge(MasterdataCargoPort portOfDischarge) {
        this.portOfDischarge = portOfDischarge;
    }

    public MasterdataCargoPort getPortOfLoading() {
        return portOfLoading;
    }

    public void setPortOfLoading(MasterdataCargoPort portOfLoading) {
        this.portOfLoading = portOfLoading;
    }

    public Supplier getHandlingAgent() {
        return handlingAgent;
    }

    public void setHandlingAgent(Supplier handlingAgent) {
        this.handlingAgent = handlingAgent;
    }

    public Supplier getCarrier() {
        return carrier;
    }

    public void setCarrier(Supplier carrier) {
        this.carrier = carrier;
    }

    public Company getNotifyParty() {
        return notifyParty;
    }

    public void setNotifyParty(Company notifyParty) {
        this.notifyParty = notifyParty;
    }

    public MasterdataModeOfTransport getModeOfTransport() {
        return modeOfTransport;
    }

    public void setModeOfTransport(MasterdataModeOfTransport transportType) {
        this.modeOfTransport = transportType;
    }

    public PriceQuote getQuote() {
        return quote;
    }

    public void setQuote(PriceQuote quote) {
        this.quote = quote;
    }

    public PjlProduct getPjlProduct() {
        return pjlProduct;
    }

    public void setPjlProduct(PjlProduct pjlProduct) {
        this.pjlProduct = pjlProduct;
    }

    public String getHbl() {
        return hbl;
    }

    public void setHbl(String hbl) {
        this.hbl = hbl;
    }

    public String getMbl() {
        return mbl;
    }

    public void setMbl(String mbl) {
        this.mbl = mbl;
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