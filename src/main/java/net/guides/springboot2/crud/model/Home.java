package net.guides.springboot2.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "home")
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "builder_name", nullable = false)
    private String builderName;

    @Column(name = "project_name", nullable = false)
    private String projectName;

    @Column(name = "plan_name", nullable = false)
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


    // estimated_cost
    // actual_cost
    // estimated_selling_price
    // actual_selling_price
    // status_code (NEW,INP,RTC,SLD)
    // date_of_sell
    // date_of_contract
    // date_of_completion



}
