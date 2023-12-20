package com.company.pjlcargoconnect.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Comment;
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
@Table(name = "CONTAINERS", indexes = {
        @Index(name = "IDX_CONTAINERS_SHIPMEN", columnList = "SHIPMEN_ID"),
        @Index(name = "IDX_CONTAINERS_CONTAINER_TYPE", columnList = "CONTAINER_TYPE_ID"),
        @Index(name = "IDX_CONTAINERS_DEPOT", columnList = "DEPOT_ID"),
        @Index(name = "IDX_CONTAINERS_WEIGHT_UNIT", columnList = "WEIGHT_UNIT_ID"),
        @Index(name = "IDX_CONTAINERS_VOLUME_UNIT", columnList = "VOLUME_UNIT_ID"),
        @Index(name = "IDX_CONTAINERS_CONTAINER_SIZE", columnList = "CONTAINER_SIZE_ID")
})
@Entity
public class Container {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull
    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "SHIPMEN_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Shipment shipment;

    @Comment("sometimes the ctnr is created without knowing which container to pick up, they just know the size and qty of cntr to pick, so that's why cntr is blank at the creation")
    @Column(name = "CONTAINER_NUMBER")
    private String containerNumber;

    @JoinColumn(name = "CONTAINER_TYPE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataContainerType containerType;

    @JoinColumn(name = "CONTAINER_SIZE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataContainerSize containerSize;

    @JoinColumn(name = "DEPOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Supplier depot;

    @Column(name = "REQUEST_LOADING_TIME")
    private OffsetDateTime requestLoadingTime;

    @Column(name = "PICKEDUP_TIME")
    private OffsetDateTime pickedupTime;

    @Column(name = "LOADING_FINISH_TIME")
    private OffsetDateTime loadingFinishTime;

    @Column(name = "PACKAGE_QTY", nullable = false)
    @NotNull
    private Integer packageQty;

    @Column(name = "NETWEIGHT")
    private Double netweight;

    @Column(name = "GROSSWEIGHT")
    private Double grossweight;

    @Column(name = "VOLUME_WEIGHT")
    private Double volumeWeight;

    @Column(name = "CHARGEABLE_WEIGHT")
    private Double chargeableWeight;

    @Column(name = "VOLUME")
    private Double volume;

    @JoinColumn(name = "WEIGHT_UNIT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataUnit weightUnit;

    @JoinColumn(name = "VOLUME_UNIT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataUnit volumeUnit;

    @Column(name = "CUSTOMS_INSPECTOR_NAME")
    private String customsInspectorName;

    @Column(name = "CUSTOMS_INSPECT_DATETIME")
    private OffsetDateTime customsInspectDatetime;

    @Column(name = "CUSTOMS_STATUS")
    private Integer customs_status;

    @Column(name = "CUSTOMS_SEAL_NUMBER")
    private String customsSealNumber;

    @Column(name = "SHIPPER_SEAL_NUMBER")
    private String shipperSealNumber;

    @Column(name = "DESCRIPTION_OF_GOODS", length = 1000)
    private String descriptionOfGoods;

    @Column(name = "SHIPPING_MARK")
    private String shippingMark;

    @Column(name = "BOOKED_PARTY_NAME")
    private String bookedPartyName;

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

    public MasterdataContainerSize getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(MasterdataContainerSize containerSize) {
        this.containerSize = containerSize;
    }

    public String getBookedPartyName() {
        return bookedPartyName;
    }

    public void setBookedPartyName(String bookedPartyName) {
        this.bookedPartyName = bookedPartyName;
    }

    public String getShippingMark() {
        return shippingMark;
    }

    public void setShippingMark(String shippingMark) {
        this.shippingMark = shippingMark;
    }

    public String getDescriptionOfGoods() {
        return descriptionOfGoods;
    }

    public void setDescriptionOfGoods(String descriptionOfGoods) {
        this.descriptionOfGoods = descriptionOfGoods;
    }

    public String getShipperSealNumber() {
        return shipperSealNumber;
    }

    public void setShipperSealNumber(String shipperSealNumber) {
        this.shipperSealNumber = shipperSealNumber;
    }

    public String getCustomsSealNumber() {
        return customsSealNumber;
    }

    public void setCustomsSealNumber(String customsSealNumber) {
        this.customsSealNumber = customsSealNumber;
    }

    public Integer getCustoms_status() {
        return customs_status;
    }

    public void setCustoms_status(Integer customs_status) {
        this.customs_status = customs_status;
    }

    public OffsetDateTime getCustomsInspectDatetime() {
        return customsInspectDatetime;
    }

    public void setCustomsInspectDatetime(OffsetDateTime customsInspectDatetime) {
        this.customsInspectDatetime = customsInspectDatetime;
    }

    public String getCustomsInspectorName() {
        return customsInspectorName;
    }

    public void setCustomsInspectorName(String customsInspectorName) {
        this.customsInspectorName = customsInspectorName;
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

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getChargeableWeight() {
        return chargeableWeight;
    }

    public void setChargeableWeight(Double chargeableWeight) {
        this.chargeableWeight = chargeableWeight;
    }

    public Double getVolumeWeight() {
        return volumeWeight;
    }

    public void setVolumeWeight(Double volumeWeight) {
        this.volumeWeight = volumeWeight;
    }

    public Double getGrossweight() {
        return grossweight;
    }

    public void setGrossweight(Double grossweight) {
        this.grossweight = grossweight;
    }

    public Double getNetweight() {
        return netweight;
    }

    public void setNetweight(Double netweight) {
        this.netweight = netweight;
    }

    public Integer getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Integer packageQty) {
        this.packageQty = packageQty;
    }

    public OffsetDateTime getLoadingFinishTime() {
        return loadingFinishTime;
    }

    public void setLoadingFinishTime(OffsetDateTime loadingFinishTime) {
        this.loadingFinishTime = loadingFinishTime;
    }

    public OffsetDateTime getPickedupTime() {
        return pickedupTime;
    }

    public void setPickedupTime(OffsetDateTime pickedupTime) {
        this.pickedupTime = pickedupTime;
    }

    public OffsetDateTime getRequestLoadingTime() {
        return requestLoadingTime;
    }

    public void setRequestLoadingTime(OffsetDateTime requestLoadingTime) {
        this.requestLoadingTime = requestLoadingTime;
    }

    public Supplier getDepot() {
        return depot;
    }

    public void setDepot(Supplier depot) {
        this.depot = depot;
    }

    public MasterdataContainerType getContainerType() {
        return containerType;
    }

    public void setContainerType(MasterdataContainerType containerType) {
        this.containerType = containerType;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipmen) {
        this.shipment = shipmen;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}