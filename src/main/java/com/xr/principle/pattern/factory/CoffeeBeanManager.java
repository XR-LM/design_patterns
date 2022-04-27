package com.xr.principle.pattern.factory;

import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaorui
 * @date 2022-04-27 16:23
 * 通过spring+EnumMap 管理bean
 */
@Service
public class CoffeeBeanManager {

    EnumMap<CoffeeEnum, Coffee> processors = new EnumMap<>(CoffeeEnum.class);

    CoffeeBeanManager(List<Coffee> coffee, Map<String, Coffee> coffeeMap) {
        for (Coffee cof : coffee) {
            processors.put(cof.getCoffeeEnum(), cof);
        }
    }

    public String getName(CoffeeEnum type) {
        return processors.get(type).getName();
    }
}
