package com.xr.principle.pattern.factory;

/**
 * 咖啡类
 *
 * @author 零
 */
public interface Coffee {
    /**
     * 获取咖啡名
     *
     * @return 咖啡名
     */
    String getName();

    /**
     * 获取当前类上的注解
     *
     * @return CoffeeEnum
     */
    default CoffeeEnum getCoffeeEnum() {
        final MethodType annotation = this.getClass().getAnnotation(MethodType.class);
        if (annotation == null) {
            return CoffeeEnum.Error;
        }
        return annotation.value();
    }
}
