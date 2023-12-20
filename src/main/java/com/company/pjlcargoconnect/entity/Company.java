package com.company.pjlcargoconnect.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "COMPANIES", indexes = {
        @Index(name = "IDX_FACTORIES_CLIENT_ACCOUNT", columnList = "CLIENT_ACCOUNT_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_FACTORY_UNQ", columnNames = {"COMPANY_NAME", "CLIENT_ACCOUNT_ID"})
})
@Entity
public class Company {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @JoinColumn(name = "CLIENT_ACCOUNT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ClientAccount clientAccountId;

    @NotBlank
    @NotEmpty
    @Column(name = "COMPANY_NAME", nullable = false)
    @NotNull
    private String companyName;

    @Column(name = "COMPANY_TYPE", nullable = false)
    @NotNull
    private Integer companyType;

    @Column(name = "ADDRESS", length = 1000)
    private String address;

    @Email
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE", length = 25)
    private String phone;

    @Column(name = "MAP_LOCATION")
    private String map_location;

    @Column(name = "LOCATION_PROVINCE")
    private String location_province;

    @Column(name = "LOCATION_COUNTRY")
    private String location_country;

    @Column(name = "LOGO", length = 500)
    private String logo;

    @Column(name = "WEBSITE")
    private String website;

    @Column(name = "REMARK", length = 1000)
    private String remark;

    @Column(name = "STATUS", nullable = false)
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

    public Company() {
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

    public void setLogo(String factory_logo) {
        this.logo = factory_logo;
    }

    public String getLocation_country() {
        return location_country;
    }

    public void setLocation_country(String location_country) {
        this.location_country = location_country;
    }

    public String getLocation_province() {
        return location_province;
    }

    public void setLocation_province(String location_province) {
        this.location_province = location_province;
    }

    public String getMap_location() {
        return map_location;
    }

    public void setMap_location(String map_location) {
        this.map_location = map_location;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer factoryType) {
        this.companyType = factoryType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String factoryName) {
        this.companyName = factoryName;
    }

    public ClientAccount getClientAccountId() {
        return clientAccountId;
    }

    public void setClientAccountId(ClientAccount clientAccountId) {
        this.clientAccountId = clientAccountId;
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