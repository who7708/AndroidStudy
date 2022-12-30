package com.example.navdrawerapp.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;

/**
 * @author Chris
 * @version 1.0
 * @since 2022-12-30
 */
public class JsonUtils {

    private static final Gson GSON = new GsonBuilder()
            .disableHtmlEscaping()
            // .setDateFormat("yyyy-MM-dd HH:mm:ss")
            // .setPrettyPrinting()
            .serializeNulls()
            .setLongSerializationPolicy(LongSerializationPolicy.STRING)
            .create();

    public static String toJson(Object src) {
        return GSON.toJson(src);
    }

    public static <T> T fromJson(String src, Class<T> clazz) {
        return GSON.fromJson(src, clazz);
    }
}
