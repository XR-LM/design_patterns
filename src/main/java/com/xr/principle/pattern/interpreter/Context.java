package com.xr.principle.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类
 *
 * @author 零
 */
public class Context {
    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        Integer value = map.get(var);
        return value;
    }
}