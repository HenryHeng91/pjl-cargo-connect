package com.company.pjlcargoconnect.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum FleetTypeEnum implements EnumClass<Integer> {

    AIRPLANE(1), 
    VESSEL(2), 
    TRUCK(3), 
    TRAIN(4);

    private final Integer id;

    FleetTypeEnum(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static FleetTypeEnum fromId(Integer id) {
        for (FleetTypeEnum at : FleetTypeEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}