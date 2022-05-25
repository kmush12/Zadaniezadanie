package com.company.zad11111.JsonConverter;

import org.json.JSONObject;

public class MergeJSONObjects {



    public static JSONObject mergeJSONObjects(JSONObject json1, JSONObject json2) {

    String buff;
    buff = (json1.toString().substring(0,json1.toString().length()-1));
    buff+=",";
    buff += json2.toString().substring(1);


    System.out.println("BUFFOR "+buff);


        return new JSONObject(buff);


}

}






