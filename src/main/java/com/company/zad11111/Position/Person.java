package com.company.zad11111.Position;

import java.util.Random;


public class Person {
    private final String _type;
    private final int _id;
    private final String key;
    private final String name;
    private String fullName;
    private final String iata_airport_code;

    public Person(String name) {
        Random rand = new Random();
        this._type = "Position";
        this._id = rand.nextInt(100000);
        this.key="null";
        this.name=name;
        this.iata_airport_code="null";
    }

    public String get_type() {
        return _type;
    }

    public int get_id() {
        return _id;
    }

    public String getKey() {
        return key;
    }


    public String getName() {
        return name;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String country) {
        this.fullName = this.name+", " + country;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }

}