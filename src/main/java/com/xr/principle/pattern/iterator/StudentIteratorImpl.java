package com.xr.principle.pattern.iterator;

import java.util.List;

/**
 * 学生迭代器对象
 *
 * @param <T> 迭代对象
 * @author 零
 */
public class StudentIteratorImpl<T> implements StudentIterator<T> {

    private final List<T> list;

    private int position = 0;

    public StudentIteratorImpl(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        T t = list.get(position);
        position++;
        return t;
    }
}
