package com.xr.principle.pattern.decorator.demo2;

/**
 * 数据源
 *
 * @author 零
 */
public interface DataSource {
    /**
     * 写入数据
     *
     * @param data 内容
     */
    void writeData(String data);

    /**
     * 读取数据
     *
     * @return 内容
     */
    String readData();
}