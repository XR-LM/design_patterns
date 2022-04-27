package com.xr.principle.pattern.factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoffeeBeanManagerTest {

    @Autowired
    private CoffeeBeanManager coffeeBeanManager;

    @Test
    public void testTestGetName() {
        final String name = coffeeBeanManager.getName(CoffeeEnum.American);
        Assert.assertEquals(name, "美式咖啡");
    }
}