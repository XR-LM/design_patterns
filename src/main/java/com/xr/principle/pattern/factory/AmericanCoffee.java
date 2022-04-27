package com.xr.principle.pattern.factory;

import org.springframework.stereotype.Service;

/**
 * 美式咖啡
 *
 * @author 零
 */
@Service(value = "am")
@MethodType(CoffeeEnum.American)
public class AmericanCoffee implements Coffee {
    @Override
    public String getName() {
        return "美式咖啡";
    }
}
