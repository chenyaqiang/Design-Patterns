package com.booxJ.iterator;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:38
 * @see:
 * @since:
 */
public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
