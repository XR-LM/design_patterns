package com.xr.principle.pattern.template;

/**
 * @author xiaorui
 * @date 2022-04-25 15:03
 */
public abstract class AbstractGoodsBillService implements GoodsBillService {

    protected abstract void saveBefore();

    protected abstract void saveAfter();

    protected void saving() {

    }

    @Override
    public final void saveBill(String bill) {
        saveBefore();
        saving();
        saveAfter();
    }

    protected abstract void deleteAfter();

    protected abstract void deleteBefore();

    protected void deleted() {

    }

    @Override
    public final void deleteBill(String bill) {
        deleteBefore();
        deleted();
        deleteAfter();
    }

}
