package com.company.zad11111;

import com.company.zad11111.Location.Geo_Position;
import com.company.zad11111.Location.Location;
import com.company.zad11111.Position.Person;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.Random;

import static com.company.zad11111.JsonConverter.MergeJSONObjects.mergeJSONObjects;
@RestController
@RequestMapping("/generate")
public class Main {
    @GetMapping("/json/{size}")
    public static String main(@PathVariable int size) {
        JSONArray finaljson = new JSONArray();
        for(int i=0; i<size; i++){
            Random rand = new Random();

            String resourceName = "dane.json";
            InputStream is = Main.class.getResourceAsStream(resourceName);
            if (is == null) {
                throw new NullPointerException("Cannot find resource file " + resourceName);
            }
            JSONTokener tokener = new JSONTokener(is);
            JSONObject obj = new JSONObject(tokener);

            JSONArray countries = obj.getJSONArray("countries");
            int c = rand.nextInt(countries.length());
            JSONObject jsonhelp1 = countries.getJSONObject(c);
            String country = jsonhelp1.getString("country");
            JSONObject info = jsonhelp1.getJSONObject("info");
            int location_id = info.getInt("location_id");
            boolean inEurope = info.getBoolean("inEurope");
            String countryCode = info.getString("countryCode");
            boolean coreCountry = info.getBoolean("coreCountry");
            String distance = info.getString("distance");

            Geo_Position geo_position = new Geo_Position();
            Location location = new Location(country, geo_position, location_id, inEurope, countryCode, coreCountry, distance);

            JSONArray names = obj.getJSONArray("names");
            int n = rand.nextInt(names.length());
            JSONObject jsonhelp2 = names.getJSONObject(n);
            String name = jsonhelp2.get("name").toString();
            Person person = new Person(name);
            person.setFullName(country);

            JSONObject json1 = new JSONObject(person);
            JSONObject json2 = new JSONObject(location);
            JSONObject endjson = mergeJSONObjects(json1, json2);
            finaljson.put(endjson);

        }
        return finaljson.toString();
    }
}