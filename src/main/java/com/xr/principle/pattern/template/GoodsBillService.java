package com.xr.principle.pattern.template;

/**
 * @author xiaorui
 * @date 2022-04-25 15:01
 */
public interface GoodsBillService {
    /**
     * 保存单据
     *
     * @param bill
     */
    void saveBill(String bill);

    /**
     * 删除单据
     *
     * @param bill
     */
    void deleteBill(String bill);
}
