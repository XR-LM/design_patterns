package com.xr.principle.demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>(8);
        map.put("name", "张三");
        map.put("age", "10");
        map.forEach((k, v) -> {
            System.out.println(v);
        });
    }
}
