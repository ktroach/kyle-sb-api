package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id", updatable = false)
    private long addressId;

    @Column(name = "street_name", nullable = false)
    private String streetName;

    @Column(name = "city_name", nullable = true)
    private String cityName;

    @Column(name = "state_abbr", nullable = true)
    private String stateAbbr;

    @Column(name = "postal_code", nullable = true)
    private String postalCode;

    @Column(name = "country_name", nullable = true)
    private String countryName;

    @Column(name = "subdivision", nullable = true)
    private String subdivision;

    @Column(name = "county_name", nullable = true)
    private String countyName;

    @Column(name = "lot_number", nullable = true)
    private String lotNumber;

    @Column(name = "block_number", nullable = true)
    private String blockNumber;

    @Column(name = "north_footage", nullable = true)
    private String northFootage;

    @Column(name = "south_footage", nullable = true)
    private String southFootage;

    @Column(name = "tract_number", nullable = true)
    private String tractNumber;

    @Column(name = "latitude", nullable = true)
    private String latitude;

    @Column(name = "longitude", nullable = true)
    private String longitude;

    public Address() {
    }

    public Address(String streetName,
                   String cityName,
                   String stateAbbr,
                   String postalCode,
                   String countryName) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateAbbr = stateAbbr;
        this.postalCode = postalCode;
        this.countryName = countryName;
    }

    public long getAddressId() {
        return addressId;
    }
    public void setAddressId(long id) {
        this.addressId = id;
    }

    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String street1) {
        this.streetName = street1;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }


    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }


    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }


    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }


    public String getNorthFootage() {
        return northFootage;
    }

    public void setNorthFootage(String northFootage) {
        this.northFootage = northFootage;
    }


    public String getSouthFootage() {
        return southFootage;
    }

    public void setSouthFootage(String southFootage) {
        this.southFootage = southFootage;
    }


    public String getTractNumber() {
        return tractNumber;
    }

    public void setTractNumber(String tractNumber) {
        this.tractNumber = tractNumber;
    }


    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Address [addressId=" + addressId
                + ", streetName=" + streetName
                + ", cityName=" + cityName
                + "]";
    }


}
