package com.company.zad11111.Location;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Geo_Position {
    private double latitude;
    private double longitude;

    public Geo_Position() {
        DecimalFormat df = new DecimalFormat("##.#######");
        double latitude = ThreadLocalRandom.current().nextDouble(-90.00, 90.00 +1);
        this.latitude = Double.parseDouble(df.format(latitude));
        double longitude = ThreadLocalRandom.current().nextDouble(0.00, 180.00 +1);
        this.longitude = Double.parseDouble(df.format(longitude));
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
