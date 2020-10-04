package br.com.restassuredapitesting.utils;

import org.json.simple.JSONObject;

public class Utils {

    public static JSONObject validPayloadBooking() {
        JSONObject payload = new JSONObject();

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2018-01-01");
        bookingdates.put("checkout", "2019-01-01");

        payload.put("firstname", "Ronaldo");
        payload.put("lastname", "Fenomeno");
        payload.put("totalprice", 111);
        payload.put("depositpaid", true);
        payload.put("bookingdates", bookingdates);
        payload.put("additionalneeds", "Breakfast");

        return payload;
    }


    public static  String getContractsBasePath(String pack, String contract) {
        return System.getProperty("user.dir")
                + "/src/test/java/br/com/restassuredapitesting/tests/"
                + pack
                + "/contracts/"
                + contract
                + ".json";
    }
}