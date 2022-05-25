package com.company.zad11111.Location;

public class Location {
    private final String type;
    private final String country;
    private Geo_Position geo_position;
    private final int location_id;
    private final boolean inEurope;
    private final String countryCode;
    private final boolean coreCountry;
    private final String distance;

    public Location(String country, Geo_Position geo_position, int location_id, boolean inEurope, String countryCode, boolean coreCountry, String distance) {
        this.type="location";
        this.country=country;
        this.geo_position=geo_position;
        this.location_id=location_id;
        this.inEurope=inEurope;
        this.countryCode=countryCode;
        this.coreCountry=coreCountry;
        this.distance=distance;
    }


    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public Geo_Position getGeo_position() {
        return geo_position;
    }

    public int getLocation_id() {
        return location_id;
    }

    public boolean isInEurope() {
        return inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public boolean isCoreCountry() {
        return coreCountry;
    }

    public String getDistance() {
        return distance;
    }

}
