package com.company.pjlcargoconnect.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@JmixEntity
@Table(name = "MASTERDATA_CONTAINER_TYPES", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_MASTERDATA_CONTAINER_TYPE_UNQ", columnNames = {"NAME"})
})
@Entity
public class MasterdataContainerType {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Integer id;

    @NotNull
    @InstanceName
    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}