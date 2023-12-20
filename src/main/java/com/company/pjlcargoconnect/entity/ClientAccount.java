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
import java.util.List;

@JmixEntity
@Table(name = "CLIENT_ACCOUNTS", indexes = {
        @Index(name = "IDX_CLIENT_ACCOUNT_UNQ_NAME", columnList = "ACCOUNT_NAME", unique = true)
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_CLIENT_ACCOUNT_UNQ_NUMBER", columnNames = {"ACCOUNT_NUMBER"})
})
@Entity
public class ClientAccount {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @NotBlank
    @NotEmpty
    @Column(name = "ACCOUNT_NAME", nullable = false)
    @NotNull
    private String accountName;

    @NotBlank
    @NotEmpty
    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    @NotNull
    private String accountNumber;

    @Column(name = "ACCOUNT_TYPE", nullable = false)
    @NotNull
    private Integer accountType;

    @NotBlank
    @NotEmpty
    @Column(name = "COMPANY_NAME", nullable = false, length = 500)
    @NotNull
    private String companyName;

    @Column(name = "COMPANY_ADDRESS")
    @Lob
    private String companyAddress;

    @Email
    @Column(name = "EMAIL", length = 500)
    private String email;

    @Column(name = "PHONE", length = 25)
    private String phone;

    @Column(name = "MAP_LOCATION")
    private String mapLocation;

    @Column(name = "COMPANY_LOGO")
    private String companyLogo;

    @Column(name = "WEBSITE")
    private String website;

    @Column(name = "REMARK", length = 1000)
    private String remark;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private Integer status;

    @NotNull
    @Column(name = "REGISTER_DATE", nullable = false)
    private OffsetDateTime registerDate;

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

    @JoinTable(name = "CONTRACT_CLIENT_ACCOUNT_LINKS",
            joinColumns = @JoinColumn(name = "CLIENT_ACCOUNT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "CONTRACT_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Contract> contracts;

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public void setRegisterDate(OffsetDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public OffsetDateTime getRegisterDate() {
        return registerDate;
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

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(String mapLocation) {
        this.mapLocation = mapLocation;
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

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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