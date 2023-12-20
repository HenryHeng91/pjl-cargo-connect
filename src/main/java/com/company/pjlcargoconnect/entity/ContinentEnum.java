package com.company.pjlcargoconnect.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ContinentEnum implements EnumClass<Integer> {

    ASIA(1),
    AFRICA(2),
    EUROPE(3),
    NORTH_AMERICA(4),
    SOUTH_AMERICA(5),
    AUSTRALIA_OCEANIA(6),
    ANTARCTICA(7);
    private final Integer id;

    ContinentEnum(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static ContinentEnum fromId(Integer id) {
        for (ContinentEnum at : ContinentEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
    }