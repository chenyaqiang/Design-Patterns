package com.booxJ.iterator;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:38
 * @see:
 * @since:
 */
public interface Collection {

    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
