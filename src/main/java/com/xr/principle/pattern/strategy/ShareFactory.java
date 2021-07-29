package com.xr.principle.pattern.strategy;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 分享工厂
 *
 * @author 零
 */
public class ShareFactory {

    /**
     * 定义策略map缓存
     */
    private static final Map<String, Class<?>> shareStrategies = new HashMap<>();

    private static final String STRATEGY_CLASS_PACKAGE = "com.xr.principle.pattern.strategy";

    static {
        Reflections reflections = new Reflections(STRATEGY_CLASS_PACKAGE);
        Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(ShareStrategyAnnotation.class);
        for (Class<?> aClass : typesAnnotatedWith) {
            ShareStrategyAnnotation annotation = aClass.getAnnotation(ShareStrategyAnnotation.class);
            shareStrategies.put(annotation.type().getCode(), aClass);
        }
    }


    public static ShareStrategy getShareStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        try {
            return (ShareStrategy) shareStrategies.get(type).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}