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

@JmixEntity
@Table(name = "PRICE_QUOTES", indexes = {
        @Index(name = "IDX_PRICE_QUOTES_ACCOUNT", columnList = "ACCOUNT_ID"),
        @Index(name = "IDX_PRICE_QUOTES_PJL_PRODUCT", columnList = "PJL_PRODUCT_ID"),
        @Index(name = "IDX_PRICE_QUOTES_CURRENCY", columnList = "CURRENCY_ID")
})
@Entity
public class PriceQuote {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @JoinColumn(name = "ACCOUNT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ClientAccount account;

    @JoinColumn(name = "PJL_PRODUCT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PjlProduct pjlProduct;

    @Column(name = "PRICE_AMOUNT", nullable = false, precision = 19, scale = 2)
    @NotNull
    private BigDecimal priceAmount;

    @Column(name = "VAT_AMOUNT", precision = 19, scale = 2)
    private BigDecimal vatAmount;

    @Column(name = "VAT_PERCENTAGE")
    private Integer vatPercentage;

    @Column(name = "CREDIT_AMOUNT", precision = 19, scale = 2)
    private BigDecimal creditAmount;

    @JoinColumn(name = "CURRENCY_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private MasterdataCurrency currency;

    @Column(name = "QUOTE_REF_NO")
    private String quoteRefNo;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private Integer status;

    @Column(name = "VALID_FROM")
    private OffsetDateTime validFrom;

    @Column(name = "VALID_TO")
    private OffsetDateTime validTo;

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

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public PriceQuote() {
        this.setStatus(1);
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getQuoteRefNo() {
        return quoteRefNo;
    }

    public void setQuoteRefNo(String quoteRefNo) {
        this.quoteRefNo = quoteRefNo;
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

    public MasterdataCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(MasterdataCurrency currency) {
        this.currency = currency;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Integer getVatPercentage() {
        return vatPercentage;
    }

    public void setVatPercentage(Integer vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    public BigDecimal getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(BigDecimal vatAmount) {
        this.vatAmount = vatAmount;
    }

    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }

    public PjlProduct getPjlProduct() {
        return pjlProduct;
    }

    public void setPjlProduct(PjlProduct pjlProduct) {
        this.pjlProduct = pjlProduct;
    }

    public ClientAccount getAccount() {
        return account;
    }

    public void setAccount(ClientAccount account) {
        this.account = account;
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