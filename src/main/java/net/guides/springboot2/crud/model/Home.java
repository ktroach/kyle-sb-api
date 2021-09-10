package net.guides.springboot2.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "home")
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "builder_name", nullable = true)
    private String builderName;

    @Column(name = "project_name", nullable = true)
    private String projectName;

    @Column(name = "plan_name", nullable = true)
    private String planName;

    @Column(name = "customer_name", nullable = true)
    private String customerName;

    @Column(name = "status_code", nullable = true)
    private String statusCode;

    @Column(name = "bedrooms", nullable = true)
    private Integer bedrooms;

    @Column(name = "full_baths", nullable = true)
    private Integer fullBaths;

    @Column(name = "half_baths", nullable = true)
    private Integer halfBaths;

    @Column(name = "stories", nullable = true)
    private Integer stories;

    @Column(name = "area_width", nullable = true)
    private Double areaWidth;

    @Column(name = "area_depth", nullable = true)
    private Double areaDepth;

    @Column(name = "area_sq_ft", nullable = true)
    private Double areaSqFt;

    @Column(name = "living_1_sq_ft", nullable = true)
    private Double living1SqFt;

    @Column(name = "living_2_sq_ft", nullable = true)
    private Double living2SqFt;

    @Column(name = "street_address", nullable = true)
    private String streetAddress;

    @Column(name = "city_name", nullable = true)
    private String cityName;

    @Column(name = "state_abbr", nullable = true)
    private String stateAbbr;

    @Column(name = "postal_code", nullable = true)
    private String postalCode;

    @Column(name = "community", nullable = true)
    private String community;

    @Column(name = "county_name", nullable = true)
    private String countyName;

    @Column(name = "country_name", nullable = true)
    private String countryName;

    @Column(name = "lot_desc", nullable = true)
    private String lotDesc;

    @Column(name = "block_number", nullable = true)
    private String blockNumber;

    @Column(name = "section_number", nullable = true)
    private String sectionNumber;

    @Column(name = "latitude", nullable = true)
    private String latitude;

    @Column(name = "longitude", nullable = true)
    private String longitude;

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getFullBaths() {
        return fullBaths;
    }

    public void setFullBaths(Integer fullBaths) {
        this.fullBaths = fullBaths;
    }

    public Integer getHalfBaths() {
        return halfBaths;
    }

    public void setHalfBaths(Integer halfBaths) {
        this.halfBaths = halfBaths;
    }

    public Integer getStories() {
        return stories;
    }

    public void setStories(Integer stories) {
        this.stories = stories;
    }

    public Double getAreaWidth() {
        return areaWidth;
    }

    public void setAreaWidth(Double areaWidth) {
        this.areaWidth = areaWidth;
    }

    public Double getAreaDepth() {
        return areaDepth;
    }

    public void setAreaDepth(Double areaDepth) {
        this.areaDepth = areaDepth;
    }

    public Double getAreaSqFt() {
        return areaSqFt;
    }

    public void setAreaSqFt(Double areaSqFt) {
        this.areaSqFt = areaSqFt;
    }

    public Double getLiving1SqFt() {
        return living1SqFt;
    }

    public void setLiving1SqFt(Double living1SqFt) {
        this.living1SqFt = living1SqFt;
    }

    public Double getLiving2SqFt() {
        return living2SqFt;
    }

    public void setLiving2SqFt(Double living2SqFt) {
        this.living2SqFt = living2SqFt;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLotDesc() {
        return lotDesc;
    }

    public void setLotDesc(String lotDesc) {
        this.lotDesc = lotDesc;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
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


    // estimated_cost
    // actual_cost
    // estimated_selling_price
    // actual_selling_price
    // status_code (NEW,INP,RTC,SLD)
    // date_of_sell
    // date_of_contract
    // date_of_completion



}
