package com.company.pjlcargoconnect.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum PortTypeEnum implements EnumClass<Integer> {

    AIRPORT(10), 
    SEAPORT(20), 
    DRYPORT(30);

    private final Integer id;

    PortTypeEnum(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static PortTypeEnum fromId(Integer id) {
        for (PortTypeEnum at : PortTypeEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}