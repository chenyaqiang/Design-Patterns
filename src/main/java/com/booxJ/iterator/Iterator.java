package com.booxJ.iterator;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:38
 * @see:
 * @since:
 */
public interface Iterator {

    //前移
    public Object previous();

    //后移
    public Object next();
    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
