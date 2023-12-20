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
import java.util.List;

@JmixEntity
@Table(name = "CONTRACTS", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_CONTRACT_UNQ_CONTRACT_NUMBER", columnNames = {"CONTRACT_NUMBER"})
})
@Entity
public class Contract {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @JoinTable(name = "CONTRACT_CLIENT_ACCOUNT_LINKS",
            joinColumns = @JoinColumn(name = "CONTRACT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "CLIENT_ACCOUNT_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<ClientAccount> clientAccountId;

    @Column(name = "CONTRACT_NUMBER", nullable = false)
    @NotNull
    private String contractNumber;

    @Column(name = "CONTRACT_TYPE", nullable = false)
    @NotNull
    private Integer contractType;

    @Column(name = "DEPOSIT_AMOUNT_IN_USD", precision = 19, scale = 2)
    private BigDecimal depositAmountInUsd;

    @Column(name = "CREDIT_AMOUNT_IN_USD_COPY", precision = 19, scale = 2)
    private BigDecimal creditAmountInUsd;

    @Column(name = "VALID_FROM")
    private OffsetDateTime validFrom;

    @Column(name = "VALID_TO")
    private OffsetDateTime validTo;

    @Column(name = "REMARK", length = 1000)
    private String remark;

    @Column(name = "STATUS")
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

    public Contract() {
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

    public OffsetDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(OffsetDateTime validTo) {
        this.validTo = validTo;
    }

    public OffsetDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public BigDecimal getCreditAmountInUsd() {
        return creditAmountInUsd;
    }

    public void setCreditAmountInUsd(BigDecimal depositAmountInUsdCopy) {
        this.creditAmountInUsd = depositAmountInUsdCopy;
    }

    public BigDecimal getDepositAmountInUsd() {
        return depositAmountInUsd;
    }

    public void setDepositAmountInUsd(BigDecimal depositAmountInUsd) {
        this.depositAmountInUsd = depositAmountInUsd;
    }

    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public List<ClientAccount> getClientAccountId() {
        return clientAccountId;
    }

    public void setClientAccountId(List<ClientAccount> clientAccountId) {
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