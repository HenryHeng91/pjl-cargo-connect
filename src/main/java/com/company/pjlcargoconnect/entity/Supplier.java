package com.company.pjlcargoconnect.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
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
@Table(name = "SUPPLIERS", indexes = {
        @Index(name = "IDX_SUPPLIER_TYPE", columnList = "TYPE_ID"),
        @Index(name = "IDX_SUPPLIER_LOCATION_COUNTRY", columnList = "LOCATION_COUNTRY_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_SUPPLIER_UNQ", columnNames = {"PJL_SUPPLIER_CODE"})
})
@Entity
public class Supplier {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Integer id;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "PJL_SUPPLIER_CODE", nullable = false, length = 100)
    @NotNull
    private String pjlSupplierCode;

    @JoinColumn(name = "TYPE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataSupplierType type;

    @Column(name = "ADDRESS", length = 1000)
    private String address;

    @Column(name = "BOOKING_EMAIL", length = 320)
    private String bookingEmail;

    @Column(name = "TRACKING_EMAIL", length = 320)
    private String trackingEmail;

    @Column(name = "EMAIL", length = 320)
    private String email;

    @Column(name = "PHONE", length = 100)
    private String phone;

    @Column(name = "MAP_LOCATION", length = 500)
    private String mapLocation;

    @Column(name = "LOCATION_PROVINCE", length = 100)
    private String locationProvince;

    @JoinColumn(name = "LOCATION_COUNTRY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MasterdataCountry locationCountry;

    @Column(name = "LOGO", length = 500)
    private String logo;

    @Column(name = "WEBSITE", length = 500)
    private String website;

    @Column(name = "REMARK", length = 1000)
    private String remark;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private Integer status;

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

    public Supplier() {
        this.setStatus(1);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public MasterdataCountry getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(MasterdataCountry locationCountry) {
        this.locationCountry = locationCountry;
    }

    public String getLocationProvince() {
        return locationProvince;
    }

    public void setLocationProvince(String locationProvince) {
        this.locationProvince = locationProvince;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(String map_location) {
        this.mapLocation = map_location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrackingEmail() {
        return trackingEmail;
    }

    public void setTrackingEmail(String tracking_email) {
        this.trackingEmail = tracking_email;
    }

    public String getBookingEmail() {
        return bookingEmail;
    }

    public void setBookingEmail(String booking_email) {
        this.bookingEmail = booking_email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MasterdataSupplierType getType() {
        return type;
    }

    public void setType(MasterdataSupplierType type) {
        this.type = type;
    }

    public String getPjlSupplierCode() {
        return pjlSupplierCode;
    }

    public void setPjlSupplierCode(String pjlSupplierCode) {
        this.pjlSupplierCode = pjlSupplierCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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