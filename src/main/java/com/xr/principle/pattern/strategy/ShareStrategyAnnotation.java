package com.xr.principle.pattern.strategy;


import java.lang.annotation.*;

/**
 * 策略类注解
 *
 * @author 零
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ShareStrategyAnnotation {

    String type();
}
