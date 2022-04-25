package com.xr.principle.pattern.template;

/**
 * @author xiaorui
 * @date 2022-04-25 15:23
 */
public abstract class GoodsBillServiceAdapter extends AbstractGoodsBillService {

    @Override
    protected void deleteAfter() {
        throw new RuntimeException("不支持该操作");
    }

    @Override
    protected void deleteBefore() {
        throw new RuntimeException("不支持该操作");
    }
}
