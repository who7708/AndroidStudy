package com.example.navdrawerapp.utils;

import androidx.fragment.app.Fragment;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Chris
 * @version 1.0
 * @since 2022-12-30
 */
public class FragmentUtils {
    public static final Map<Class<? extends Fragment>, Fragment> FRAGMENT_CACHE = new ConcurrentHashMap<>();

    public static <T extends Fragment> T getFragment(Class<T> clazz) {
        Fragment fragment = FRAGMENT_CACHE.get(clazz);
        if (fragment == null) {
            try {
                fragment = clazz.newInstance();
            } catch (Exception ignore) {
            }
            FRAGMENT_CACHE.put(clazz, fragment);
        }
        return (T) fragment;
    }
}
