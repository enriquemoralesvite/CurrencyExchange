package com.currencyconverter;

import java.util.Map;

public class CurrencyService {
    private final ApiClient apiClient= new ApiClient();
    private final JsonParser parser = new JsonParser();

    public double convertCurrency(String fromCurrency, String toCurrency, double amount){
        String json = apiClient.getRatesJson(fromCurrency);
        if (json == null ){
            throw new RuntimeException("Error al obtener tasas desde la API");
        }

        Map<String, Double> rates = parser.parseRates(json);
        if (!rates.containsKey(toCurrency)){
            throw new RuntimeException("Moneda de destino no soportada");
        }
        double rate = rates.get(toCurrency);
        return amount * rate;
    }
}
