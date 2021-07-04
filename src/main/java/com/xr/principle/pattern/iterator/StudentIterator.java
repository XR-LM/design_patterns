package com.xr.principle.pattern.iterator;


import com.xr.principle.pattern.prototype.Student;

/**
 * 学生迭代器
 *
 * @author 零
 */
public interface StudentIterator<T> {
    /**
     * 是否有下个元素
     *
     * @return true false
     */
    boolean hasNext();

    /**
     * 获取下个元素
     *
     * @return 学生对象
     */
    T next();

}
