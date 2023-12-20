package com.company.pjlcargoconnect.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum FreightTypeEnum implements EnumClass<Integer> {

    PREPAID(1), 
    COLLECT(2);

    private final Integer id;

    FreightTypeEnum(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static FreightTypeEnum fromId(Integer id) {
        for (FreightTypeEnum at : FreightTypeEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}