package com.practice.demo.training.classandinstance;

import java.util.HashMap;
import java.util.Map;

public class AreaCodeHolder {
    public Map<String, String> getAreaCodes() {
        Map<String, String> areaCodes = new HashMap<>();

        areaCodes.put("03", "東京");
        areaCodes.put("0742", "奈良");
        areaCodes.put("011", "札幌");

        return areaCodes;
    }
}
