package com.xr.principle;

/**
 * 默认皮肤
 *
 * @author 零
 */
public class DefaultSkin extends AbstractSkin {

    @Override
    void display() {
        System.out.println("默认皮肤");
    }

    public void getParentSkin() {
        super.fillRequest();
    }
}
