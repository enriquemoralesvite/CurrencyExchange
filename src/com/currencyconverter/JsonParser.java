package com.currencyconverter;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonParser {
    public Map<String, Double> parseRates(String json) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonObject ratesObject = jsonObject.getAsJsonObject("conversion_rates");

        Map<String, Double> rates = new HashMap<>();
        for (String key : ratesObject.keySet()) {
            rates.put(key, ratesObject.get(key).getAsDouble());
        }
        return rates;
    }

}
