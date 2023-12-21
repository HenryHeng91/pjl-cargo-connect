package com.company.pjlcargoconnect.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum GenericStatusEnum implements EnumClass<Integer> {

    ACTIVE(1), 
    INACTIVE(0);

    private final Integer id;

    GenericStatusEnum(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static GenericStatusEnum fromId(Integer id) {
        for (GenericStatusEnum at : GenericStatusEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}