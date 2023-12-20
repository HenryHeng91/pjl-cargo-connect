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
@Table(name = "PJL_PRODUCTS", indexes = {
        @Index(name = "IDX_PJL_PRODUCTS_PRODUCTCATEGORY", columnList = "PRODUCTCATEGORY_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_PJL_PRODUCT_UNQ", columnNames = {"PRODUCT_CODE"})
})
@Entity
public class PjlProduct {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @Column(name = "PRODUCT_NAME", nullable = false)
    @NotNull
    private String productName;

    @Column(name = "PRODUCT_CODE", nullable = false)
    @NotNull
    private String product_code;

    @JoinColumn(name = "PRODUCTCATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MasterdataProductCategory productcategory;

    @InstanceName
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "REMARK")
    private String remark;

    @NotNull
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

    public PjlProduct() {
        this.setStatus(1);
    }

    public MasterdataProductCategory getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(MasterdataProductCategory productcategory) {
        this.productcategory = productcategory;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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