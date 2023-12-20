package com.company.pjlcargoconnect.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@JmixEntity
@Table(name = "MASTERDATA_SUPPLIER_TYPES", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_MASTERDATA_SUPPLIER_TYPE_UNQ", columnNames = {"SUPPLIER_TYPE_NAME"})
})
@Entity
public class MasterdataSupplierType {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Integer id;

    @Column(name = "SUPPLIER_TYPE_NAME", nullable = false, length = 100)
    @NotNull
    private String supplierTypeName;

    public String getSupplierTypeName() {
        return supplierTypeName;
    }

    public void setSupplierTypeName(String supplierTypeName) {
        this.supplierTypeName = supplierTypeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}