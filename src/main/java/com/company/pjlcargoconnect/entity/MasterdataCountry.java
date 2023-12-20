package com.company.pjlcargoconnect.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "MASTERDATA_COUNTRIES", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_COUNTRY_UNQ_NAME", columnNames = {"COUNTRY_NAME"}),
        @UniqueConstraint(name = "IDX_COUNTRY_UNQ_ISO2", columnNames = {"COUNTRY_CODE_ISO2"}),
        @UniqueConstraint(name = "IDX_COUNTRY_UNQ_ISO3", columnNames = {"COUNTRY_CODE_ISO3"})
})
@Entity
public class MasterdataCountry {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Integer id;

    @Column(name = "COUNTRY_NAME")
    private String countryName;

    @Column(name = "COUNTRY_CODE_ISO2", length = 2)
    private String countryCodeIso2;

    @Column(name = "COUNTRY_CODE_ISO3", length = 3)
    private String countryCodeIso3;

    @Column(name = "OFFICIAL_LANGUAGE_CODE_ISO2", length = 3)
    private String officialLanguageCodeIso2;

    @Column(name = "PHONE_CODE", length = 10)
    private String phoneCode;

    @Column(name = "CONTINENT")
    private Integer continent;

    @Column(name = "CURRENCY", length = 3)
    private String currency;

    @Column(name = "TIMEZONE", length = 100)
    private String timezone;

    @JmixGeneratedValue
    @Column(name = "UUID")
    private UUID uuid;

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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ContinentEnum getContinent() {
        return continent == null ? null : ContinentEnum.fromId(continent);
    }

    public void setContinent(ContinentEnum continent) {
        this.continent = continent == null ? null : continent.getId();
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getOfficialLanguageCodeIso2() {
        return officialLanguageCodeIso2;
    }

    public void setOfficialLanguageCodeIso2(String officialLanguageCodeIso2) {
        this.officialLanguageCodeIso2 = officialLanguageCodeIso2;
    }

    public String getCountryCodeIso3() {
        return countryCodeIso3;
    }

    public void setCountryCodeIso3(String countryCodeIso3) {
        this.countryCodeIso3 = countryCodeIso3;
    }

    public String getCountryCodeIso2() {
        return countryCodeIso2;
    }

    public void setCountryCodeIso2(String countryCodeIso2) {
        this.countryCodeIso2 = countryCodeIso2;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}