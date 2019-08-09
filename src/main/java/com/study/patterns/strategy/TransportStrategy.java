package com.study.patterns.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Huzi on 2019/8/9.
 */
public class TransportStrategy {

    private static Map<String, Transport> transportMap = new HashMap<>();

    static {
        transportMap.put("Subway", new Subway());
        transportMap.put("Taxi", new Taxi());
        transportMap.put("Bus", new Bus());
    }

    private TransportStrategy() {
    }

    public static Transport get(String transportKey) {
        return transportMap.get(transportKey);
    }

}
