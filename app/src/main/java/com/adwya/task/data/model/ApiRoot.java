package com.adwya.task.data.model;

import java.util.HashMap;

/**
 * Created by Aya Mohamed on 11/13/2019.
 */
public class ApiRoot {
    public static final int SUCCESS = 200;
    public static final int EXPIRED = 401;
    private static final String PAGE = "page";

    public static HashMap<String, String> getPages(int page) {
        HashMap<String, String> map = new HashMap<>();
        map.put(PAGE , String.valueOf(page));
        return map;
    }
}
