package com.xr.principle.pattern.factory;

import org.springframework.stereotype.Service;

/**
 * 拿铁咖啡
 *
 * @author 零
 */
@Service(value = "lt")
@MethodType(CoffeeEnum.Latte)
public class LatteCoffee implements Coffee {
    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}
