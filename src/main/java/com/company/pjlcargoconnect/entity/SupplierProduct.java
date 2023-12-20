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
@Table(name = "SUPPLIER_SERVICES", indexes = {
        @Index(name = "IDX_SUPPLIER_SERVICES_SUPPLIER", columnList = "SUPPLIER_ID"),
        @Index(name = "IDX_SUPPLIER_SERVICES_SERVICE_TYPE", columnList = "SERVICE_TYPE_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_SUPPLIER_PRODUCT_UNQ", columnNames = {"PRODUCT_CODE"})
})
@Entity
public class SupplierProduct {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Integer id;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "SUPPLIER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Supplier supplier;

    @Column(name = "PRODUCT_CODE", nullable = false)
    @NotNull
    private String productCode;

    @Column(name = "PRODUCT_NAME", nullable = false)
    @NotNull
    private String productName;

    @Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription;

    @JoinColumn(name = "SERVICE_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MasterdataSupplierType serviceType;

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

    public MasterdataSupplierType getServiceType() {
        return serviceType;
    }

    public void setServiceType(MasterdataSupplierType serviceType) {
        this.serviceType = serviceType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String serviceDescription) {
        this.productDescription = serviceDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String serviceName) {
        this.productName = serviceName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String serviceCode) {
        this.productCode = serviceCode;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
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